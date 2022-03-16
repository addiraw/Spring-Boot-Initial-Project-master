package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course getCourseById(int id);
	public Course postCourse(Course c);
	public void deleteCourse(int id);
	public void updatrCourse(Course course,int id);
}
