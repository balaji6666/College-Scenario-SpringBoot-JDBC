package com.foobar.spring.dao;

import org.springframework.data.repository.CrudRepository;

import com.foobar.spring.model.Department;

public interface DepartmentDaoRepository extends CrudRepository<Department,Integer>{

}
