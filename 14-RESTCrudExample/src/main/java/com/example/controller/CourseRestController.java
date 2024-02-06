package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.Course;
import com.example.service.CourseService;

@RestController
public class CourseRestController {

	@Autowired
	private CourseService courseService; 
	
	@PostMapping(value = "/course")
	public ResponseEntity<String> createCourse(@RequestBody Course course)
	{
		String status = courseService.upsert(course);
		
		return new ResponseEntity<String>(status,HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/course/{id}")
	public ResponseEntity<Course> getCourse(@PathVariable("id") Integer id)
	{
		Course course = courseService.getById(id);
		
		return new ResponseEntity<Course>(course,HttpStatus.OK);
	}
	
	@GetMapping("/allCourses")
	public ResponseEntity<List<Course>> getAllCourses()
	{
		List<Course> allCourses = courseService.getAllCourses();
		return new ResponseEntity<List<Course>>(allCourses,HttpStatus.OK);
	}
	
	@PutMapping("/updateCourse")
	public ResponseEntity<String> updateCourse(@RequestBody Course course)
	{
		String upsert = courseService.upsert(course);
		return new ResponseEntity<String>(upsert,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteCourse/{id}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer id)
	{
		String deleteMsg = courseService.deleteById(id);
		return new ResponseEntity<String>(deleteMsg,HttpStatus.OK);
	}
	
	@GetMapping("/getTheDetails")
	public ResponseEntity<Course> getDetails()
	{
		Course course = new Course(111,"JAVA", 7000.00);
		return new ResponseEntity<Course>(course,HttpStatus.OK);
	}
	
}
