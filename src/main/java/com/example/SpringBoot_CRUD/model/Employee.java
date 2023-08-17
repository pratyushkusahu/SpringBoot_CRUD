package com.example.SpringBoot_CRUD.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="first_Name")
	private String firstname;
	@Column(name="last_Name")
	private String lastName;
	@Column(name="e_mail")
	private String Email;
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Employee(int id, String firstname, String lastName, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		Email = email;
	}
	public Employee() {
		super();
	}

}
