package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/welcome") //optional 
public class HomeController {

	@RequestMapping(value="/welcome",method = RequestMethod.GET)
	public String welcomeMsg() {
		return "Welcome To Rest";
	}
	
	@GetMapping(value = "/welcomeMsg")
	public ResponseEntity<String> welcome(@RequestParam("user") String user)
	{
		System.out.println("Executing");
		return new ResponseEntity<String>(user,HttpStatus.SEE_OTHER);
	}
	
	/*
	 * @RequestMapping(value="/calculate",method = RequestMethod.GET) public int
	 * calculate(@RequestParam("n1") int n1,@RequestParam("n2") int n2) { int
	 * total=n1+n2; return total; }
	 */
	
}
