package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Course;
// import because it help in below code see Course 

public interface UserRepository extends CrudRepository<Course, Integer> {

}
