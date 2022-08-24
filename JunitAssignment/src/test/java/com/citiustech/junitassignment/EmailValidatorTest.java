package com.citiustech.junitassignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class EmailValidatorTest {

	@Test
	void testValidateEmailId() {
		fail("Not yet implemented");
	}
	
	@Test
	void validateEmailidValidEmailId() throws Exception {
		EmailValidator validator = new EmailValidator();
		boolean actual=validator.ValidateEmailId("James_Potter@infy.com");
		boolean expected = true;
		assertEquals(actual,expected);
	}
	
	@Test
	void validateEmailidInValidEmailId() throws Exception {
		EmailValidator validator = new EmailValidator();
		boolean actual=validator.ValidateEmailId("James_Potter@infy.org");
		boolean expected = false;
		assertEquals(actual,expected);
	}
	
	@Test
	void validateEmailidInValidEmailIdException() throws Exception {
		EmailValidator validator = new EmailValidator();
		boolean actual=validator.ValidateEmailId(null);
		boolean expected = false;
		assertEquals(actual,expected);
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"Sirius_Black","Lily_Evans@Hoggy.in","Remus_Lups","NymphieTonks@magic.com"})
	void validateEmailidParameterizedEmailId(String word) throws Exception {
		EmailValidator validator = new EmailValidator();
		assertTrue(validator.ValidateEmailId(word));
	}
	

}
