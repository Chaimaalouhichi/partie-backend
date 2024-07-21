package tn.teams.lmselearning.services;

import tn.teams.lmselearning.dto.AuthenticationRequest;
import tn.teams.lmselearning.dto.AuthenticationResponse;
import tn.teams.lmselearning.dto.RegistrationRequest;

public interface AuthUserService {
    AuthenticationResponse register(RegistrationRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);

}