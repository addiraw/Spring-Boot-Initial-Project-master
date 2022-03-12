package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Course;
import com.example.demo.services.*;

@RestController
public class Mycontroller {
	@Autowired
	private CourseService courseService;
	@GetMapping("/home")
	public String home()
	{
		return "Welcome to course applciation";
		

		
	}
			//get the course
		@GetMapping("/courses")
		public List<Course> getCourses()
		{
			return this.courseService.getCourses();
		}
		
}
