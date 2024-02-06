package com.example.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassangerInfo {
	
	private String fname;
	private String lname;
	private String from;
	private String to;
	private String flightId;
	private String journeyDate;
	
	
	

}
