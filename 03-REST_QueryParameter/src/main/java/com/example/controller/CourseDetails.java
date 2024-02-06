package com.example.controller;

//http://localhost:8088/course?cname=java&tname=JamesGosling
//use above url to test this method
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/course")
public class CourseDetails {

	//@RequestMapping(value = "/getCourse",method = RequestMethod.GET)
	@GetMapping("/course")
	public String getDetails(@RequestParam("cname") String courseName,
							 @RequestParam("tname") String trainerName) {
		
		//return "Course name is:"+cname+"Teacher name is"+tname;
       
		if(courseName.equals("java") && trainerName.equals("JamesGosling")) {
			return "SuccessFully";
		}
		
			return "Wrong i/p";
		
	}
}
