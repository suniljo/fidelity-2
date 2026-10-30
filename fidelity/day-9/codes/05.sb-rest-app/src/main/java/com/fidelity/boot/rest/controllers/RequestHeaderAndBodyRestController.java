package com.fidelity.boot.rest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RequestHeaderAndBodyRestController {
	@PostMapping(path="/data")
	public ResponseEntity<String> handleRequestHeaderAndBody(@RequestHeader("Host") String host,
															 @RequestHeader(value="contact", required=false, defaultValue = "NA") String contact,
															 @RequestBody(required = false) String requestData){
		String responseText = String.format("Host:  %s\nContact: %s\nRequest Body: %s", host, contact, requestData);
		
		return ResponseEntity.ok(responseText);
	}

}
