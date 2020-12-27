package com.example.aopdemo.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.aopdemo.model.Employee;
import com.example.aopdemo.repository.EmployeeRepository;

@Component
public class EmployeeImplementation implements EmployeeRepository{

	@Autowired
	Employee e,e1,e2;
	@Autowired
	List<Employee> list1,list2;
	public String getCompanyname() {
		System.out.println("in implementation");
		// TODO Auto-generated method stub
		return "CompanyName";
	}

	public Employee getEmployee() {
		// TODO Auto-generated method stub
		
		
		e.setId(1);
		e.setName("a");
		e.setSalary(20000);
		
		list1.add(e);
		
//		e.setId(2);
//		e.setName("b");
//		e.setSalary(30000);
//		list.add(e);
		System.out.println("list of employees "+list1.get(0).toString());
		return e;
	}
	
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		
		
		e1.setId(1);
		e1.setName("a");
		e1.setSalary(20000);
		
		list2.add(e1);
		
//		e2.setId(2);
//		e2.setName("b");
//		e2.setSalary(30000);
//		list2.add(e2);
		System.out.println("list of employees "+list2.get(0).toString());
		System.out.println("list of employees "+list2.get(1).toString());
		return list2;
	}

	public Integer sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("in implementation");
		return a+b;
	}
	
	

	
	
	
}
