package com.tec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tec.model.Course;
import com.tec.repository.CourseRepository;



@RestController
@RequestMapping("/api/courses")
 class CourseController {
	
	@Autowired
	private CourseRepository courseRepository;
	
	@GetMapping
	public List<Course> list(){
		//return null;
		return courseRepository.findAll();
	}

}
