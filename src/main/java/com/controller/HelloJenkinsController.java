package com.controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class HelloJenkinsController {
	
	@GetMapping
	public ResponseEntity<?> hola()
	{
		
		return ResponseEntity.ok(Map.of("message","Hola JENKINS!","timestamp", LocalDateTime.now().toString()));
	}

	

}
