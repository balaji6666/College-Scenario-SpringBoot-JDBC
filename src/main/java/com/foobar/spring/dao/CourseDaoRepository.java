package com.foobar.spring.dao;

import org.springframework.data.repository.CrudRepository;

import com.foobar.spring.model.Course;

public interface CourseDaoRepository extends CrudRepository<Course,Integer>{
	
}
