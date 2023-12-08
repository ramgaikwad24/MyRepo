package com.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashokit.entity.Employee;




public interface EmployeeService 
{
	
	public Employee addEmployee(Employee employee);
	public List<Employee> getEmployee();
	
}
