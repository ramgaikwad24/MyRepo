package com.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.entity.Employee;
import com.ashokit.service.EmployeeService;

import ch.qos.logback.core.status.Status;

@RestController
@RequestMapping("/employees")
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addUser")
	public Employee addUser(@RequestBody Employee employee)
	{
		   return employeeService.addEmployee(employee);
		
	}

	@GetMapping("/users")
	public List<Employee> getAll(){
		return employeeService.getEmployee();
	}
}
