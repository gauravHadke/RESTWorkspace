package com.example.homeController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Request.PassangerInfo;
import com.example.Response.TicketIssueOnPassangerReq;

@RestController
public class UserController {
	
	@RequestMapping(value = "/getPassangerInfo" ,method = RequestMethod.GET,
			        produces = "application/json")
	public PassangerInfo getInfo()
	{
		PassangerInfo p=new PassangerInfo();
		return p;
	}
	
	@PostMapping(value = "/BookTicket" ,
			    produces = {"application/json","application/xml"},
			    consumes = {"application/json","application/xml"})
	public ResponseEntity<TicketIssueOnPassangerReq> bookTicket(@RequestBody PassangerInfo pi)
	{
		TicketIssueOnPassangerReq ticket = new TicketIssueOnPassangerReq();
		ticket.setTicketNumber("554AUS28");
		ticket.setJourneyDate("26/09/2026");
		ticket.setPassangerName(pi.getFname()+" "+pi.getLname());
		ticket.setFrom(pi.getFrom());
		ticket.setTo(pi.getTo());
		ticket.setPrice("29000");
		
		return new ResponseEntity<TicketIssueOnPassangerReq>(ticket,HttpStatus.CREATED);
	}

}
