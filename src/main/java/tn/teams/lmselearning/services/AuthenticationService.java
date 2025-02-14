package tn.teams.lmselearning.services;



import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;
import tn.teams.lmselearning.configsecurite.JwtService;
import tn.teams.lmselearning.dto.AuthenticationRequest;
import tn.teams.lmselearning.dto.AuthenticationResponse;
import tn.teams.lmselearning.dto.RegistrationRequest;
import tn.teams.lmselearning.entites.Role;
import tn.teams.lmselearning.entites.Token;
import tn.teams.lmselearning.entites.TokenType;
import tn.teams.lmselearning.entites.User;
import tn.teams.lmselearning.repository.RoleRepository;
import tn.teams.lmselearning.repository.TokenRepository;
import tn.teams.lmselearning.repository.UserRepository;

import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
	 private final RoleRepository roleRepository;
  private final UserRepository repository;
  private final TokenRepository tokenRepository;
  private final PasswordEncoder passwordEncoder;
  private final JwtService jwtService;
  private final AuthenticationManager authenticationManager;

  public AuthenticationResponse register(RegistrationRequest request) {
	 //
	  Set<String> strRoles = request.getRole();
      Set<Role> roles = new HashSet<>();
      //System.err.println(strRoles[]);
      if (strRoles == null) {
          Role userRole = roleRepository.findByName("UTILISATEUR")
                  .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
          roles.add(userRole);
      } else {
          strRoles.forEach(role -> {

                  Role adminRole = roleRepository.findByName(role)
                          .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                  roles.add(adminRole);

          });
      }

    //   
	  
	  //
	  
	  
	  
	  User  user = User.builder()
        .fullname(request.getFullname())
    
        .email(request.getEmail())
        .password(passwordEncoder.encode(request.getPassword()))
        .build();
	  user.setRoles(roles);
    var savedUser = repository.save(user);
    var jwtToken = jwtService.generateToken(user);
    var refreshToken = jwtService.generateRefreshToken(user);
    saveUserToken(savedUser, jwtToken);
    return AuthenticationResponse.builder()
        .accessToken(jwtToken)
            .refreshToken(refreshToken)
        .build();
  }

  public AuthenticationResponse authenticate(AuthenticationRequest request) {
    authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(
            request.getEmail(),
            request.getPassword()
        )
    );
    var user = repository.findByEmail(request.getEmail())
        .orElseThrow();
    var jwtToken = jwtService.generateToken(user);
    var refreshToken = jwtService.generateRefreshToken(user);
    revokeAllUserTokens(user);
    saveUserToken(user, jwtToken);
    return AuthenticationResponse.builder()
        .accessToken(jwtToken)
            .refreshToken(refreshToken)
        .build();
  }

  private void saveUserToken(User user, String jwtToken) {
    var token = Token.builder()
        .user(user)
        .token(jwtToken)
        .tokenType(TokenType.BEARER)
        .expired(false)
        .revoked(false)
        .build();
    tokenRepository.save(token);
  }

  private void revokeAllUserTokens(User user) {
    var validUserTokens = tokenRepository.findAllValidTokenByUser(user.getId());
    if (validUserTokens.isEmpty())
      return;
    validUserTokens.forEach(token -> {
      token.setExpired(true);
      token.setRevoked(true);
    });
    tokenRepository.saveAll(validUserTokens);
  }

  public void refreshToken(
          HttpServletRequest request,
          HttpServletResponse response
  ) throws IOException {
    final String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
    final String refreshToken;
    final String userEmail;
    if (authHeader == null ||!authHeader.startsWith("Bearer ")) {
      return;
    }
    refreshToken = authHeader.substring(7);
    userEmail = jwtService.extractUsername(refreshToken);
    if (userEmail != null) {
      var user = this.repository.findByEmail(userEmail)
              .orElseThrow();
      if (jwtService.isTokenValid(refreshToken, user)) {
        var accessToken = jwtService.generateToken(user);
        revokeAllUserTokens(user);
        saveUserToken(user, accessToken);
        var authResponse = AuthenticationResponse.builder()
                .accessToken(accessToken)
                .refreshToken(refreshToken)
                .build();
        new ObjectMapper().writeValue(response.getOutputStream(), authResponse);
      }
    }
  }
}
