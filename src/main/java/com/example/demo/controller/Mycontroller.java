package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Course;
import com.example.demo.services.CourseService;

@RestController
public class Mycontroller {
	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to course applciation";

	}

	// get the course
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.courseService.getCourses();
	}

	@GetMapping("/courses/{id}")
	public Course getCourseById(@PathVariable("id") int id) {
		return courseService.getCourseById(id);
	}

	@PostMapping("/courses")
	public Course postCourse(@RequestBody Course course) {
		Course c = this.courseService.postCourse(course);
		System.out.println(c);
		return c;
	}

	// delete course from list item
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable("id") int id) {
		this.courseService.deleteCourse(id);
	}

	// update the course
	@PutMapping("/course/{id}")
	public Course courseUpdate(@RequestBody Course course, @PathVariable("id") int id)// @RequestBody Course course for
																						// incoming json data
	// and @@PathVariable for
	{
		this.courseService.updatrCourse(course, id);
		return course;
	}
}
