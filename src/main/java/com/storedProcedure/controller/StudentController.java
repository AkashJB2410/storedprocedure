package com.storedProcedure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.storedProcedure.entity.Student;
import com.storedProcedure.service.StudentService;

@RestController
@RequestMapping("/save")
public class StudentController {
	
	@Autowired 
	StudentService service ;

	public StudentController(StudentService service) {
		super();
//		this.service = service;
	}
	
	@GetMapping("/data")
	public List<Student> getAllData (){
		return service.getAllData();
	}
	
	@PostMapping("/add")
	public ResponseEntity<Student> saveStudentInfo(@RequestBody Student student) {
		return new ResponseEntity<Student>(service.saveStudentInfo(student),HttpStatus.CREATED);
		
	}

}
