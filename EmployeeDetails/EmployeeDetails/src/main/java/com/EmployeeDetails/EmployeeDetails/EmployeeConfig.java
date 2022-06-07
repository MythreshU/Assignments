package com.EmployeeDetails.EmployeeDetails;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class EmployeeConfig {
	
	@Bean(name = "company")
	public Company companybean() {
		return new Company();
	}
	@Bean
	@Primary
	public Employee employeebean() {
		return new Employee();
	}

}
