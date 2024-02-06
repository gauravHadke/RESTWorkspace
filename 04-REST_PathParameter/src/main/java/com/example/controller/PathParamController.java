package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//http://localhost:8082/course/java -->Duaration of java is 6months
//use above url to run this 

@RestController
public class PathParamController {
	//bydefault spring rest produce json data 
	@GetMapping(value="/course/{name}",produces = {"application/json"})
	public String getCourseDuration(@PathVariable("name") String cname) {
		
		System.out.println("COurse name :"+cname);
		if(cname.equals("java")) {
		  return "Duration of"+cname+" is 6months ";//restApi
		}
		else if(cname.equals("mysql")) {
			return "Duration of "+cname+" is 3months";
		}else
		{
			return "No details available";
		}
	}
	
	@GetMapping(value="/course/{cname}/{tname}")
	public String getCourseDetails(@PathVariable("cname") String cname,
							       @PathVariable("tname") String tname)
	{ 
		if(cname.equals("java") && tname.equals("deeepak")) {
			return "java is oop and deepak is trainer";
		}
		else {
			return "wrong i/p...!!";
		
		}
	}
	
	@GetMapping(value = "/course/{cname}/fastrack/{tname}")
	public String getDetails(@PathVariable("cname") String crsName,
						     @PathVariable("tname") String trnName)
	{
		return "Please enroll quickly";
	}
}
