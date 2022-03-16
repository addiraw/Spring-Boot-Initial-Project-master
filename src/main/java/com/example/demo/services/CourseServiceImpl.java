package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.*;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private UserRepository userRepository;
	// List<Course> list;

	// public CourseServiceImpl() {
	// list = new ArrayList<>();
	// list.add(new Course(1, "java course0", "my first java course"));
	// list.add(new Course(2, "java course0", "my first java course"));
	// list.add(new Course(3, "python course0", "my first pythin course"));

	// }

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		// return list;
		List<Course> list = (List<Course>) this.userRepository.findAll();
		return list;
	}

	// get all course
	// public List<Course> getAllCourses() {
	// return list;
	// }
	// get course by id
	@Override
	public Course getCourseById(int id) {
		Course course = null;
		// course = list.stream().filter(e -> e.getId() == id).findFirst().get();
		try{
			this.userRepository.findById(id);
		}catch (Exception e) {
		e.printStackTrace();
	}
		return course;
	}

	// post course by post method
	@Override
	public Course postCourse(Course course) {
		// list.add(c);
		Course result = userRepository.save(course);
		return result;
	}

	@Override
	public void deleteCourse(int id) {
		// list =
		// list.stream().filter(course->course.getId()!=id).collect(Collectors.toList());
		// list = list.stream().filter(book -> {
		// 	if (book.getId() != id) {
		// 		return true;
		// 	} else {
		// 		return false;
		// 	}
		// }).collect(Collectors.toList());
		userRepository.deleteById(id);

	}

	@Override
	public void updatrCourse(Course course, int id) {
		// list.stream().map(b -> { // map will return all element one by one
		// 	if (course.getId() == id) {
		// 		b.setTitle(course.getTitle());
		// 		b.setDescription(course.getDescription());
		// 	}
		// 	return b;
		// }).collect(Collectors.toList()); // COllect all element in new list
		course.setId(id);
		userRepository.save(course);
		//save and update are both work same
	}
}
