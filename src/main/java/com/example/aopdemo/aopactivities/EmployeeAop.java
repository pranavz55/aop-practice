package com.example.aopdemo.aopactivities;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.example.aopdemo.model.Employee;


@Component
@Aspect
public class EmployeeAop {

//	@Before(value="execution(* com.example.aopdemo.implementation.EmployeeImplementation.*(..))")
//	public void getCompanynamebefore() {
//		System.out.println("in before ");
//	}
//	
//	@After(value="execution(* com.example.aopdemo.implementation.EmployeeImplementation.*(..))")
//	public void getCompanynameafter() {
//		System.out.println("in after ");
//	}
	
	//around example
	//error does not return string to web page and it shows string in afterreturn ststement
//	@Around(value="execution(* com.example.aopdemo.implementation.EmployeeImplementation.*(..))")
//	public void getCompanynamearound(ProceedingJoinPoint jp) {
//		System.out.println("in around init ");
//		try {
//			jp.proceed();
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("in around final ");
//	}
	
	//returning string example
//	@AfterReturning(value="execution(* com.example.aopdemo.implementation.EmployeeImplementation.*(..))"
//			,returning="str")
//	public void getCompanynameafterreturn(JoinPoint joinPoint, String str) {
//		System.out.println("returning "+joinPoint.getSignature());
//		System.out.println("method returns "+str);
//	}
	
	//returning employee object example
//	@AfterReturning(value="execution(* com.example.aopdemo.implementation.EmployeeImplementation.*(..))"
//			,returning="employee")
//	public void getEmployeeafterreturn(JoinPoint joinPoint, Employee employee) {
//		System.out.println("returning "+joinPoint.getSignature());
//		System.out.println("method returns "+employee.toString());
//	}
	
	//returning list of Employee object
	@AfterReturning(value="execution(* com.example.aopdemo.implementation.EmployeeImplementation.*(..))"
			,returning="list")
	public void getEmployeelistafterreturn(JoinPoint joinPoint, List<Employee> list) {
		System.out.println("returning "+joinPoint.getSignature());
		for (Employee employee : list) {
			System.out.println("method returns "+employee.toString());
		}
	}
		//argument passing to pointcut
		@After(value="execution(* com.example.aopdemo.implementation.EmployeeImplementation.*(..)) and args(a, b)"
				)
		public void getsum(int a,int b) {
		System.out.println("sum after method "+(a+b));
	}
	
}
