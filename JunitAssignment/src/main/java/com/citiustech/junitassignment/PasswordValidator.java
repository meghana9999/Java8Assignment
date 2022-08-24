package com.citiustech.junitassignment;

public class PasswordValidator {
	public boolean ValidatePassword(String password) throws Exception {
		if(password ==null || password .isEmpty()) {
			throw new Exception("Invalid Password");
		}else if(password.length()>8 && password.length()<20) {
			return false;
		}else {
			
		}
		return false;
	}
}
