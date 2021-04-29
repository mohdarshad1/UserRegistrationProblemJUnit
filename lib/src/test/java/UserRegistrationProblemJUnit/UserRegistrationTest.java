package UserRegistrationProblemJUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration validatorObj = new UserRegistration();
		boolean result = validatorObj.validateFirstName("Sippora");
		assertTrue(result);
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration validatorObj = new UserRegistration();
		boolean result = validatorObj.validateLastName("Toppo");
		assertTrue(result);
	}
	
	@Test
	public void givenEmail_whenMatches_ShouldReturnTrue() {
		UserRegistration validatorObj = new UserRegistration();
		assertTrue(validatorObj.validateEmail("abc04.xyz@gmail.co.in"));
	}

	@Test
	public void givenPhoneNumber_whenMatches_ShouldReturnTrue() {
		UserRegistration validatorObj = new UserRegistration();
		assertTrue(validatorObj.validatePhoneNumber("919001233201"));
	}

	public void givenPassword_whenMatches_ShouldReturnTrue() {
		UserRegistration validatorObj = new UserRegistration();
		assertTrue(validatorObj.validatePassword("@qwerty!@*"));
	}
	
}
