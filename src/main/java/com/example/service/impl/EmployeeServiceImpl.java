package com.example.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.controller.EmployeeController;
import com.example.entity.Employee;
import com.example.exception.ResourceNotFoundException;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	

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
		logger.info("Start: EmployeeServiceImpl ---> getById Id is {}",id);
		Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee Not Found with given id"));
		logger.info("End: EmployeeServiceImpl ---> getById Id is {}",id);
		return employee;
	}

}
