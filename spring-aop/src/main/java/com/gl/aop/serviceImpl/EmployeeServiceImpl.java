package com.gl.aop.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.aop.entity.Employee;
import com.gl.aop.repository.EmployeeRepository;
import com.gl.aop.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository empRepo;
	
	@Override
	public String save(Employee emp) {
		empRepo.saveAndFlush(emp);
		return "Employee successfully added to DB";
	}

	@Override
	public String delete(int id) {
		empRepo.deleteById(id);
		return "Employee is deleted!";
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Employee emp) {
		empRepo.saveAndFlush(emp);
		return "Employee successfully updated to DB";
	}

	@Override
	public Optional<Employee> getEmployeeById(int id) {
		return empRepo.findById(id);
	}

}
