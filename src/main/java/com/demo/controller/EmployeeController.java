package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/employee")
	public List<Employee> get(){
		return employeeService.get();
	}
}
