package com.cogent.springsecurityDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.springsecurityDemo.payload.request.SignupRequest;
import com.cogent.springsecurityDemo.repository.RoleRepository;
import com.cogent.springsecurityDemo.repository.UserRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;
	
	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(SignupRequest signupRequest){
		
	}

}
