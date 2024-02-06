package com.example.controllerResource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.PassengerInfo;
import com.example.response.TicektIssueOnthePassengerRequest;

@RestController
public class ErailResourceController {
	
	@RequestMapping(
				value = "/bookTicket",method = RequestMethod.GET,
				produces = {
							"application/json",
							"application/xml"
				},
				consumes = {
							"application/json",
							"application/xml"
				})
	
	public TicektIssueOnthePassengerRequest bookTicket(@RequestBody PassengerInfo pinfo)
	{
		System.out.println(pinfo);

		TicektIssueOnthePassengerRequest ticket = new TicektIssueOnthePassengerRequest();
		
		ticket.setTicketId("1234");
		ticket.setTicketStatus("Confirmed");
		ticket.setJourneyDate(pinfo.getJourneyDate());
		ticket.setPassangerName(pinfo.getFirstName()+" "+pinfo.getLastName());
		ticket.setFrom("India");
		ticket.setTo("NewYorkCity");
		ticket.setTrainNumber(pinfo.getTrainNumber());
		ticket.setTicketPrice("370.00");
		
		
		return ticket;
	}
	
    @GetMapping(value = "/getInfo")
	public PassengerInfo getInfo() {
		 
		PassengerInfo pi=new PassengerInfo();
		
		return pi;
	}

	
	@PostMapping(
			value = "/bookTickett",
			produces = {
						"application/json",
						"application/xml"
			},
			consumes = {
						"application/json",
						"application/xml"
			})

public ResponseEntity<TicektIssueOnthePassengerRequest> bookTicket1(PassengerInfo pinfo)
{
	System.out.println(pinfo);

	TicektIssueOnthePassengerRequest ticket = new TicektIssueOnthePassengerRequest();
	
	ticket.setTicketId("1234");
	ticket.setTicketStatus("Confirmed");
	ticket.setJourneyDate(pinfo.getJourneyDate());
	ticket.setPassangerName(pinfo.getFirstName()+" "+pinfo.getLastName());
	ticket.setTrainNumber(pinfo.getTrainNumber());
	ticket.setTicketPrice("370.00");
	
	
	return new ResponseEntity<TicektIssueOnthePassengerRequest>(ticket,HttpStatus.CREATED);
}

}
