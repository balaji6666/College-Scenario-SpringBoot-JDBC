package com.foobar.spring.dao;

import org.springframework.data.repository.CrudRepository;

import com.foobar.spring.model.Instructor;

public interface InstructorDaoRepository extends CrudRepository<Instructor,Integer>{

}
