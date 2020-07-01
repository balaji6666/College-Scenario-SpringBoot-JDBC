package com.foobar.spring.dao;

import org.springframework.data.repository.CrudRepository;

import com.foobar.spring.model.Student;

public interface StudentDaoRepository extends CrudRepository<Student,Integer>{

}
