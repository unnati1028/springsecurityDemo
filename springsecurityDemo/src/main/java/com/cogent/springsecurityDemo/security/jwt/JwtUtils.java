package com.cogent.springsecurityDemo.security.jwt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.security.core.Authentication;

//this class is responsible for handling and validating tokens
@Component
public class JwtUtils {
	@Value("springsecurityDemo.app.jwtSecret")
	private String jwtSecret;
	@Value("springsecurityDemo.app.jwtExpiraqtionMs")
	private int jwtExpirationMs;

	public String generateJwtToken(Authentication authentication) {
		
		
	}
}