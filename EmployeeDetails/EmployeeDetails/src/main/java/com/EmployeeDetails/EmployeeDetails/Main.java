package com.EmployeeDetails.EmployeeDetails;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		Employee E = context.getBean(Employee.class);
		
		Company C = E.getCompany();
		
		System.out.println(E);

	}

}
