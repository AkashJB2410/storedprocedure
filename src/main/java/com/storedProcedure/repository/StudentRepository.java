package com.storedProcedure.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.storedProcedure.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
	
	@Procedure("Akash")
	public List<Student> getAllData();
		
	
}
