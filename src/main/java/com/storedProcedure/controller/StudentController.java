package com.storedProcedure.controller;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	}
	
	@GetMapping("/data")
	public List<Student> getAllData (){
		return service.getAllData();
	}
	
	@PostMapping("/add0")
	public ResponseEntity<Student> saveStudentInfo(@RequestBody Student student) {
		return new ResponseEntity<Student>(service.saveStudentInfo(student),HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("{id}")
	public HttpEntity<String> deleteStudentInfo(@PathVariable("id") int id){
		Student.deleteStudentInfo(id);
		 return new ResponseEntity<String>("Student Deleted",HttpStatus.OK);
	}

}
