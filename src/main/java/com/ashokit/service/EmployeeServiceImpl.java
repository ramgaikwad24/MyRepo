package com.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.Employee;
import com.ashokit.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee addEmployee(Employee employee) {
	
		Employee addEmployee = employeeRepo.save(employee);
		return addEmployee;
	}

	@Override
	public List<Employee> getEmployee() {
		List<Employee> findAll = employeeRepo.findAll();
		return findAll;
	}

	



	
}


