package com.example.demo.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.*;

@Service
public class CourseServiceImpl implements CourseService {
	
	
	List<Course> list;
	public CourseServiceImpl()
	{
		list=new ArrayList<>();
		list.add(new Course(143,"java course0","my first java course"));
		
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
}
