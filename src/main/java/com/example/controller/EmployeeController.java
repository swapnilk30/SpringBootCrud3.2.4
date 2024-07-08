package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	//
	@PostMapping("/create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
		Employee created = employeeService.create(employee);
		return new ResponseEntity<Employee>(created,HttpStatus.CREATED);
	}
	
	//
	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> list = employeeService.getAll();
		return ResponseEntity.ok(list);
	}

	// 
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
		logger.info("Start: EmployeeController ---> getEmployeeById Id is {}",id);
		Employee employee = employeeService.getById(id);
		logger.info("End: EmployeeController ---> getEmployeeById Id is {}",id);
		return ResponseEntity.ok(employee);
	}
	
}
