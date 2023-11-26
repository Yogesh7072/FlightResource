package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.services.StudentService;

@RestController
public class StudentController {
	@Autowired
	Student student;
	@Autowired
	StudentService studentService;

	@PostMapping(value = "/savesStu", produces = { "application/json", "application/xml" }, consumes = {
			"application/json", "application/xml" })
	public ResponseEntity<Student> saveStudent(@RequestBody Student stu) {

		Student saveStudent = studentService.saveStudent(stu);

		return new ResponseEntity<Student>(saveStudent, HttpStatus.CREATED);

	}

	@GetMapping(value = "/allStu", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<Student>> getAllStudent() {

		List<Student> saveStudent = studentService.getAllStudent();

		return new ResponseEntity<List<Student>>(saveStudent, HttpStatus.CREATED);

	}

}
