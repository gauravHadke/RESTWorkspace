package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Simple1 {

	@GetMapping(value="/getmsg")
	public String getMsgBy()
	{
		return "welcome";
	}
}
