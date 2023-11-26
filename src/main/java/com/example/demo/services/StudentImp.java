package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentImp {

	public Student saveStudent( Student stu);
	public List<Student> getAllStudent();

}
