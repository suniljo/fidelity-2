package com.fidelity.irctc.controler;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fidelity.irctc.models.Passenger;
import com.fidelity.irctc.models.Ticket;

@RestController
@RequestMapping(path = "/irctc")
public class TicketRestController {

	@PostMapping(produces = { "application/json", "application/xml" }, 
				 consumes = { "application/json", "application/xml" })
	public ResponseEntity<Ticket> newTicketBooking(@RequestBody Passenger psngr) {
		Ticket ticket = new Ticket();

		ticket.setPassengerName(psngr.getPassengerName());
		ticket.setFromStation(psngr.getFromStation());
		ticket.setToStation(psngr.getToStation());
		ticket.setDateOfJourney(psngr.getDateOfJourney());
		ticket.setTrainNo(psngr.getTrainNo());

		String ticketStatus = new Random().nextBoolean() ? "CONFIRMED" : "WAITING";
		ticket.setBookingStatus(ticketStatus);

		ticket.setDateOfBooking(LocalDate.now());

		float fare = new Random().nextFloat(1000, 3000);
		float roundedValue = Math.round(fare * 100.0f) / 100.0f;
		ticket.setTicketFare(roundedValue);

		String pnr = generatePNR();
		ticket.setPnr(pnr);

		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
	}

	private String generatePNR() {
		UUID uuid = UUID.randomUUID();
		String pnr = uuid.toString().replaceAll("-", "").substring(0, 7).toUpperCase();
		return pnr;
	}
}
