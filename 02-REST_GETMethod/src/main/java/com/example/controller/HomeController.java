package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/welcome")
public class HomeController {

	
	@Value("${studentName}")
	public String getvalue;
	
	@GetMapping("/welcomeMsg")
	public String welcomeMsg()
	{
		return "Welcome"+getvalue+" to REST Environment...";
	}
	
	//queryParameter
	@GetMapping(value = "/calculate")
	public String Calculator(@RequestParam("num1") int n1,@RequestParam("num2") int n2)
	{
		int total=n1+n2;
		return "The total of these two numbers is :"+total;
	}
	
	//pathParameter
	@GetMapping(value = "/square/{num1}")
	public int square(@PathVariable("num1") Integer n1)
	{
		return n1*n1;
	}
	
//	@RequestMapping(value = "/jhgj/" , method = RequestMethod.GET)
//	public String m1()
//	{
//		
//	}
}
