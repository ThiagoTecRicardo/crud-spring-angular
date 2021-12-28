package com.tec.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tec.model.Course;
import com.tec.repository.CourseRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {
	
	
	private final CourseRepository courseRepository = null;
	
	@GetMapping
	public List<Course> list(){
		return courseRepository.findAll();
	}

}
