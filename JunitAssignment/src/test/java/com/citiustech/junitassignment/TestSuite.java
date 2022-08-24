package com.citiustech.junitassignment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	EmailValidatorTest.class,
	PasswordValidator.class
})
public class TestSuite {

}
