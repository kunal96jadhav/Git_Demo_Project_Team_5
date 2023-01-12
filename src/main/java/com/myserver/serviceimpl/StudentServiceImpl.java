package com.myserver.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myserver.model.Student;
import com.myserver.repository.StudentRepository;
import com.myserver.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepository sr;
	@Override
	public Student saveStudent(Student s) {
		return  sr.save(s);
		
	}

}
