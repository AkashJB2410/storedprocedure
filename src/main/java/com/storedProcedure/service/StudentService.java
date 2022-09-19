package com.storedProcedure.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storedProcedure.entity.Student;
import com.storedProcedure.repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	public List<Student> getAllData() {
		return studentRepository.getAllData();
	}
	
	public Student saveStudentInfo(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
}
