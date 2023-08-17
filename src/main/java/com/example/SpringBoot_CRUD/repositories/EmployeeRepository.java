package com.example.SpringBoot_CRUD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBoot_CRUD.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
