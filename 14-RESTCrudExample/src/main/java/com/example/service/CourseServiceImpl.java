package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.binding.Course;
import com.example.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepository courseRepo;

	@Override
	public String upsert(Course course) {
		// TODO Auto-generated method stub
		
		courseRepo.save(course);
		
		return "Success";
	}

	@Override
	public Course getById(Integer id) {
		// TODO Auto-generated method stub
		
		Optional<Course> findById = courseRepo.findById(id);
		
		if(findById.isPresent()) {
			return findById.get();
		}
		
		return null; //return null object
	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		List<Course> findAll = courseRepo.findAll();
		
		return findAll;
	}

	@Override
	public String deleteById(Integer cid) {
		// TODO Auto-generated method stub
		if(courseRepo.existsById(cid))
		{
			courseRepo.deleteById(cid);
			return "delete record successfully";
		}else {
			return "No record found";
		}	
	}
}
