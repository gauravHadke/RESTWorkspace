package com.example.request;

import lombok.Data;

@Data
//@XmlRootElement  --- Binding class to represent stucture of xml

public class PassengerInfo {

	private String firstName;
	private String lastName;
	private String to;
	private String from;
	private String journeyDate;
	private String trainNumber;
}
