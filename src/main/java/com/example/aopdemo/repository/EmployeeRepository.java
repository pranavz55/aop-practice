package com.example.aopdemo.repository;

import java.util.List;

import com.example.aopdemo.model.Employee;

public interface EmployeeRepository {

	String getCompanyname();
	Employee getEmployee();
	List<Employee> getEmployeeList();
	Integer sum(int a,int b);
}
