package tn.teams.lmselearning.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationResponse {

	@JsonProperty("access_token")
	  private String accessToken;
	  @JsonProperty("refresh_token")
	  private String refreshToken;
}
