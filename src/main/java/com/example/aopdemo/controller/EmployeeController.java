package com.example.aopdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aopdemo.implementation.EmployeeImplementation;
import com.example.aopdemo.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeImplementation employeeimplementation;
	
	@GetMapping("/")
	public String getCompanyName() {
		System.out.println("in controller");
		return employeeimplementation.getCompanyname();
	}
	
	@GetMapping("/getEmployee")
	public Employee getEmployee() {
		System.out.println("in controller");
		return employeeimplementation.getEmployee();
	}
	
	@GetMapping("/getEmployeeList")
	public List<Employee> getEmployeeList() {
		System.out.println("in controller");
		return employeeimplementation.getEmployeeList();
	}
	
	@GetMapping("/getSum")
	public Integer getSum() {
		System.out.println("in controller");
		return employeeimplementation.sum(20, 30);
	}
}
