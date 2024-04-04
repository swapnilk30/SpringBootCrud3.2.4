package com.example.service;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeService {
	
	// create Employee
	Employee create(Employee employee);
	
	// get All Employees
	List<Employee> getAll();
	
	// find By Id
	Employee getById(Long id);

}
