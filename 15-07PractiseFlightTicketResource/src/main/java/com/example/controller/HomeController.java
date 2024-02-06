package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.PassangerInfo;
import com.example.response.TicektIssueOnPassangerInfo;

//@Controller
@RestController
public class HomeController {

	//@ResponseBody
	@RequestMapping(value = "/getInfo" , 
					method = RequestMethod.GET,
					produces = {"application/json"} )
	public PassangerInfo getInfo()
	{
		PassangerInfo pi = new PassangerInfo();
		pi.setId(111);
		pi.setFname("Gaurav");
		pi.setLname("Hadke");
		pi.setCity("Baramati");
		pi.setTo("Dubai");
		pi.setFrom("India");
	
		return pi;
	}
	
	@PostMapping(value = "/set")
	public ResponseEntity<TicektIssueOnPassangerInfo> setInfo(@RequestBody PassangerInfo pi)
	{
		TicektIssueOnPassangerInfo ticket = new TicektIssueOnPassangerInfo();
		ticket.setName(pi.getFname()+" "+pi.getLname());
		ticket.setTicketNumber(24251);
		ticket.setFrom(pi.getFrom());
		ticket.setTo(pi.getTo());
		ticket.setPrice("6770.00");
		ticket.setDate("26/09/2024");
		
		return  new ResponseEntity<TicektIssueOnPassangerInfo>(ticket,HttpStatus.ACCEPTED);
	}
	
	
}
