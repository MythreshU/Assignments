package com.EmployeeDetails.EmployeeDetails;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("Mythresh")
	private String name; 
	
	@Value("Analyst A4")
    private String designation;
	
	@Resource(name = "company")
    private Company company;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee \nname=" + name + ",\ndesignation=" + designation + ",\n" + company + "]";
	}
    
    

}
