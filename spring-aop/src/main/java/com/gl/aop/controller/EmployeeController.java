package com.gl.aop.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.aop.entity.Employee;
import com.gl.aop.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@PostMapping("/addEmployee")
	public String addEmployee(Employee empl) {
		return empService.save(empl);
	}
	
	@PutMapping("/updateEmployee")
	public String updateEmployee(Employee empl) {
		return empService.update(empl);
	}
	
	@GetMapping("/getEmployeeById")
	public Optional<Employee> getEmployeeById(int id){
		return empService.getEmployeeById(id);
	}
	
	@DeleteMapping("/deleteEmployeeById")
	public String deleteEmployeeById(int id) {
		return empService.delete(id);
	}
	
}
