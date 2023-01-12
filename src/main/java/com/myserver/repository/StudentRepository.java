package com.myserver.repository;

import org.springframework.data.repository.CrudRepository;

import com.myserver.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
