package com.tavant.spring.jdbc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tavant.spring.jdbc.beans.Employee;
import com.tavant.spring.jdbc.service.EmployeeService;

@RestController
@RequestMapping("Employee")
public class EmployeeController {

	@Autowired
	EmployeeService ser;

	@GetMapping("/EmpNumber")
	int getCount() {
		return ser.getCount();
	}

	@GetMapping("/Employees")
	List<Employee> getAllEmployee() {
		return ser.getAllEmployee();
	}

	@PostMapping("/add")
	void addEmployee(@RequestBody Employee employee) {
		ser.addEmployee(employee);
	}

	@PutMapping("/update/{id}")
	void updateEmployee(@PathVariable int employeeId, @RequestBody Employee employee) {
		ser.updateEmployee(employeeId, employee);
	}

	@DeleteMapping("/delete/{id}")
	void deleteEmployee(@PathVariable int employeeId) {
		ser.deleteEmployee(employeeId);
	}

}
