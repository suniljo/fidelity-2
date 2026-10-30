package com.fidelity.irctc.models;

import java.time.LocalDate;

import com.fidelity.irctc.adapters.LocalDateAdapter;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Ticket {
	private String passengerName;
	private String fromStation;
	private String toStation;	
	
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	private LocalDate dateOfJourney;
	private String trainNo;
	
	private String pnr;
	
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	private LocalDate dateOfBooking;
	private String bookingStatus;
	private Float ticketFare;	
}
