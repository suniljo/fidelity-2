package com.fidelity.boot.rest.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateTimeRestController {
	
	@GetMapping(path = {"/today", "/date"})
	public ResponseEntity<String> showTodaysDateAndTime() {
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd-MMM-YYYY  HH:mm:ss");
		
		String dateTime = dtFormatter.format(ldt);
		
		//ResponseEntity<String> responseEntity = new ResponseEntity<String>(HttpStatus.OK);
		//ResponseEntity<String> responseEntity = new ResponseEntity<String>(dateTime, HttpStatus.CREATED);
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("company", "Fidelity Investments");
		responseHeaders.add("contact", "Albert");
		
		/*
		ResponseEntity<String> responseEntity = new ResponseEntity<String>(dateTime, responseHeaders, HttpStatus.CREATED);
		return responseEntity;
		*/
		
		//return ResponseEntity.ok().build();
		//return ResponseEntity.ok().body(dateTime);
		//return ResponseEntity.ok().headers(responseHeaders).body(dateTime);
		
		return ResponseEntity.badRequest().body(dateTime);
	}
}
