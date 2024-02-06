package com.example.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketInfo {

	private String name;
	private String from;
	private String to;
	private String flightId;
	private String journeyDate;
	private String ticketPrice;
	private String ticketStatus;
}
