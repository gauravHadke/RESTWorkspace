package com.example.response;

import lombok.Data;

@Data
//@XmlRootElement -- Binding class for XML support
//@XmlRootElement
public class TicektIssueOnthePassengerRequest {
	
	private String ticketId;
	private String ticketStatus;
	private String ticketPrice;
	private String passangerName;
	private String from;
	private String to;
	private String trainNumber;
	private String journeyDate;

}
