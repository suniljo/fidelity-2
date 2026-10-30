package com.fidelity.boot.rest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cibil")
public class CibilScoreRestController {
	@GetMapping(path = {"/score/{name}/{pan}", "/score/{name}"})
	public ResponseEntity<?> getCibilScore(@PathVariable("name") String customerName,
										   @PathVariable(required = false) String pan) {
		System.out.println(pan);
		
		if (pan == null || pan.length() != 10) {
			return ResponseEntity.badRequest().build();
		}

		String responseText = String.format("Hi %s, your PAN is: %s, and your score is 803", customerName, pan);
		return ResponseEntity.ok(responseText);
	}
}
