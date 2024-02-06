package com.example.response;

import lombok.Data;

@Data
public class TicektIssueOnPassangerInfo {

	private int TicketNumber;
	private String name;
	private String to;
	private String from;
	private String date;
	private String price;
	
}
