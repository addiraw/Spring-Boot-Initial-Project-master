package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.Course;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(DemoApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		Course course = new Course();
		course.setTitle("Aditya");
		course.setDescription("First");
		Course course1 = userRepository.save(course);
		System.out.println(course1);

		Course course2 = new Course();
		course2.setTitle("Aditya");
		course2.setDescription("First");
		Course course3 = userRepository.save(course);
		System.out.println(course3);
	}

}

