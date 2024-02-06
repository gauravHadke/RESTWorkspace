package com.example.Response;

import lombok.Data;

@Data
public class TicketIssueOnPassangerReq {
	
	private String ticketNumber;
	private String journeyDate;
	private String passangerName;
	private String from;
	private String to;
	private String price;

}
