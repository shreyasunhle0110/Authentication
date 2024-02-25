package com.Bank_Property_Evaluation.Authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bank_Property_Evaluation.Authentication.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@CrossOrigin
@RestController
public class loginComponent {

	private static final Logger logger = LoggerFactory.getLogger(loginComponent.class);

	@Autowired
	private com.Bank_Property_Evaluation.Authentication.repository.userRepository userRepository;

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User loginUser) {
		logger.info("Attempting login for user: {}", loginUser.getUsername());
		User user = userRepository.findByUsername(loginUser.getUsername());
		if (user != null && user.getPassword().equals(loginUser.getPassword())) {
			logger.info("Login successful for user: {}", loginUser.getUsername());
			return ResponseEntity.ok(user);
		} else {
			logger.warn("Failed login attempt for user: {}", loginUser.getUsername());
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
		}
	}
}
