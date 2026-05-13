package com.controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloCloudController {
	
	@GetMapping
	public ResponseEntity<?> sayHello()
	{
		
		return ResponseEntity.ok(Map.of("message","Hola desde AWS!","timestamp", LocalDateTime.now().toString()));
	}

}
