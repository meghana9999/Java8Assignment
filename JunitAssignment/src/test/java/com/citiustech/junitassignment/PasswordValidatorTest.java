package com.citiustech.junitassignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PasswordValidatorTest {

	@Test
	void testValidatePassword() {
		fail("Not yet implemented");
	}
	
	@Test
	void validatePasswordValidPassword() throws Exception {
		PasswordValidator validator = new PasswordValidator();
		boolean actual=validator.ValidatePassword("Asdf123");
		boolean expected = false;
		assertEquals(actual,expected);
	}
	
	@Test
	void validatePasswordInValidPassword() throws Exception {
		PasswordValidator validator = new PasswordValidator();
		boolean actual=validator.ValidatePassword("Asdf");
		boolean expected = true;
		assertEquals(actual,expected);
	}
	
	@Test
	void validatePasswordInValidPasswordException() throws Exception {
		PasswordValidator validator = new PasswordValidator();
		boolean actual=validator.ValidatePassword(null);
		//boolean expected = false;
		assertNull(actual);
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"Qwerty","Qwerty1234","QwerAsdfZxcvVcxzFdsaRewq","Zxcvb54321"})
	void validatePasswordpParameterizedPassword(String word) throws Exception {
		PasswordValidator validator = new PasswordValidator();
		assertTrue(validator.ValidatePassword(word));
	}

}
