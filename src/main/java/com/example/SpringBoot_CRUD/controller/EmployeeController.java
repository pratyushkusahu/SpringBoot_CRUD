package com.example.SpringBoot_CRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot_CRUD.model.Employee;
import com.example.SpringBoot_CRUD.repositories.EmployeeRepository;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {
	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return empRepo.findAll();
	}
	
}
