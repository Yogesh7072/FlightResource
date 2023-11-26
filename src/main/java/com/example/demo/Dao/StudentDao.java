package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;
import com.example.demo.repositry.StudentRepo;

@Repository
public class StudentDao {
	@Autowired
	StudentRepo repo;

	public Student saveStudent(Student stu) {

		Student save = repo.save(stu);
		return save;
		// TODO Auto-generated method stub

	}

	public List<Student> getAll() {
		// TODO Auto-generated method stub

		List<Student> findAll = repo.findAll();
		System.out.println(findAll);

		return findAll;
	}

}
