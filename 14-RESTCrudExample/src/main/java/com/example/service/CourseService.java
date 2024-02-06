package com.example.service;

import java.util.List;

import com.example.binding.Course;

public interface CourseService {
	
	public String upsert(Course course); //save(insert) and update
	public Course getById(Integer cid);
	public List<Course> getAllCourses();
	public String deleteById(Integer cid);
	

}
