   package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fpd")
public class QuaeryParamRestController {
	
	//query parameter is mendatory 
	@GetMapping(value = "/score") //required use for make query parameter optional
	//default use for to consider default value if client didnt send value
	public String getFpdScore(@RequestParam(value = "ssn",
											required = false,
											defaultValue = "878787") Long ssn) {
		//retrive from db
		System.out.println("SSN :"+ssn);
		return "FPD score is : 75";
	}
	
	//but we can make query parameter optional(request Param attributes are availble)
	//@RequestParam(value="ssn",required=false)

}
