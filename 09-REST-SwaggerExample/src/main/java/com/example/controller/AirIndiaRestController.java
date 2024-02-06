package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.PassangerInfo;
import com.example.response.TicketInfo;

@RestController
public class AirIndiaRestController {
	
	@GetMapping(value ="/getInfo")
//				produces = {"application/json","application/xml"},
//				consumes = {"application/json","application/xml"})
	public PassangerInfo getInfo()
	{
		PassangerInfo pi=new PassangerInfo();
		pi.setFlightId("1111");
		pi.setFname("Pranav");
		pi.setJourneyDate("28/12/2024");
		pi.setFrom("India");
		pi.setTo("Dubai");
		
		return pi;
	}
	
	@PostMapping(value = "/bookTicket")
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassangerInfo pinfo)
	{ 
		TicketInfo ticket=new TicketInfo();
		ticket.setName(pinfo.getFname()+" "+pinfo.getLname());
		ticket.setFrom(pinfo.getFrom());
		ticket.setTo(pinfo.getTo());
		ticket.setTicketPrice("Rs:- 6899/-");
		ticket.setJourneyDate(pinfo.getJourneyDate());
		ticket.setFlightId(pinfo.getFlightId());
		ticket.setTicketStatus("CONFIRMED..");
		return new ResponseEntity<TicketInfo>(ticket,HttpStatus.CREATED);
	}

}
