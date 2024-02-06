package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Student;

//bydefault support json data
@RestController
public class HomeController {
	
	@GetMapping(value = "/student/{id}",
				produces = {"application/xml",
							"application/json"
						   })
	public Student s1(@PathVariable("id") int id)
	{
		Student student = new Student();
		if(id==101)
		{
			student.setStudentId(101);
			student.setStudentName("Hariss");
			student.setStudentSkill("Java");
			
		}else if(id == 102) {
			student.setStudentId(102);
			student.setStudentName("Umang");
			student.setStudentSkill("Python");
		}
		return student;
	}

}
