package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.StudentDao;
import com.example.demo.model.Student;

@Service
public class StudentService implements StudentImp {
	@Autowired
	StudentDao student;

	@Override
	public Student saveStudent(Student stu) {
		Student saveStudent = student. saveStudent(stu);
		return saveStudent;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> stu=student.getAll();
		
		
		return stu;
	}

}
