package com.citiustech.junitassignment;

public class EmailValidator {
	
	public boolean ValidateEmailId(String emailId) throws Exception {
		if(emailId==null || emailId.isEmpty()) {
			throw new Exception("Invalid Email id");
		}else {
			
		}
		return false;
	}
}
