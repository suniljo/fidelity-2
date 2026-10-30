package com.fidelity.boot.rest.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/fidelity/welcome")
public class WelcomeRestController {
	@GetMapping
	public String showWelocmeMessageGet() {
		return "Welcome to Fidelity - GET";
	}
	
	@PostMapping
	public String showWelocmeMessagePost() {
		return "Welcome to Fidelity - POST";
	}
	
	@PutMapping
	public String showWelocmeMessagePut() {
		return "Welcome to Fidelity - PUT";
	}
	
	@DeleteMapping
	public String showWelocmeMessageDelete() {
		return "Welcome to Fidelity - DELETE";
	}
	
	@PatchMapping
	public String showWelocmeMessagePatch() {
		return "Welcome to Fidelity - PATCH";
	}	
}
