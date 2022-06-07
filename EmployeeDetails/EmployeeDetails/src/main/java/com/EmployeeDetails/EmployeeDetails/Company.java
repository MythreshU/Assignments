package com.EmployeeDetails.EmployeeDetails;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Value("Capgemini")
	private String companyName;
	@Value("123456")
	private String companyId;

	public String getCompanyName() {
		return companyName;
	}
    
	@Required
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
    
	public String getCompanyId() {
		return companyId;
	}
    @Required
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	@Override
	public String toString() {
		return "Company \ncompanyName=" + companyName + ",\ncompanyId=" + companyId + "]";
	}
    
	
	

}
