package com.gl.aop.service;

import java.util.List;
import java.util.Optional;

import com.gl.aop.entity.Employee;

public interface EmployeeService {

	public String save(Employee emp);
	
	public String update(Employee emp);
	
	public String delete(int id);
	
	public Optional<Employee> getEmployeeById(int id);
	
	public List<Employee> getAllEmployee();
	
}
