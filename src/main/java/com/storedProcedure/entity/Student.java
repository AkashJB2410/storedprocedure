package com.storedProcedure.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentinfo")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id ;

	@Column(name="rollno")
	private int rollno ;
	
	@Column(name="prename")
	private String prename ;
	
	@Column(name="firstname")
	private String firstname ;
	
	@Column(name="lastname")
	private String lastname ;
	
	@Column(name="city")
	private String city ;
	
	@Column(name="branch")
	private String branch ;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getPrename() {
		return prename;
	}
	public void setPrename(String prename) {
		this.prename = prename;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public Student(int id, int rollno, String prename, String firstname, String lastname, String city, String branch) {
		super();
		this.id = id;
		this.rollno = rollno;
		this.prename = prename;
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.branch = branch;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
