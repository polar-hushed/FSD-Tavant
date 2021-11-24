package com.tavant.spring.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tavant.spring.jdbc.beans.Employee;
import com.tavant.spring.jdbc.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;

	public List<Employee> getAllEmployee() {
		return repo.getAllEmployee();
	}

	public void addEmployee(@RequestBody Employee employee) {
		repo.addEmployee(employee);
	}

	public int getCount() {
		return repo.getCount();
	}

	public void updateEmployee(@PathVariable int EmployeeId, @RequestBody Employee employee) {
		repo.updateEmployee(EmployeeId, employee);
	}

	public void deleteEmployee(@PathVariable int EmployeeId) {
		repo.deleteEmployee(EmployeeId);
	}

}
