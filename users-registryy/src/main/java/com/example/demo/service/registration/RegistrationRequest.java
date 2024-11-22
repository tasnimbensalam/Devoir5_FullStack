package com.example.demo.service.registration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class RegistrationRequest {
	private String username;
	private String password;
	private String email;

}