package com.myserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myserver.model.Student;
import com.myserver.serviceimpl.StudentServiceImpl;

@RestController
public class StudentController {
	@Autowired
	StudentServiceImpl ss;
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public ResponseEntity<Student> studentAdd(@RequestBody Student s) {
		Student saveStudent = ss.saveStudent(s);
		return new ResponseEntity<Student>(saveStudent,HttpStatus.CREATED);
	}
}
