package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.exception.ResourceNotFoundException;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee create(Employee employee) {
		
		Employee savedEmployee = employeeRepository.save(employee);
		
		return savedEmployee;
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> listOfEmployee = employeeRepository.findAll();
		return listOfEmployee;
	}

	@Override
	public Employee getById(Long id) {
		Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee Not Found with given id"));
		return employee;
	}

}
