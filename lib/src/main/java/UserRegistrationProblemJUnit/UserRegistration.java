package UserRegistrationProblemJUnit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
		
		public static final String NAME_PATTERN = "^[A-Z]{1}[a-zA-z]{2,}";
		public static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][0-9a-zA-Z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$"; 
		public static final String PHONE_PATTERN = "^[1-9]+[0-9]+[/s\\\\-]?[1-9]{1}[0-9]{9}$";
		public static final String PASSWORD_PATTERN = "^[a-zA-Z]*@[^W][a-zA-Z0-9]*${8,}";
	/*
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Welcome to User Registration Problem");
			
		}
	*/
		// validation
		public boolean validateFirstName(String fname) {
			Pattern pattern = Pattern.compile(NAME_PATTERN);
			return pattern.matcher(fname).matches();
		}

		public boolean validateLastName(String lname) {
			Pattern pattern = Pattern.compile(NAME_PATTERN);
			return pattern.matcher(lname).matches();
		}

		public boolean validateEmail(String email) {
			Pattern pattern = Pattern.compile(EMAIL_PATTERN);
			return pattern.matcher(email).matches();
		}

		public boolean validatePhoneNumber(String phoneNumber) {
			Pattern pattern = Pattern.compile(PHONE_PATTERN);
			Matcher matcher = pattern.matcher(phoneNumber);
			return matcher.find();
		}

		public boolean validatePassword(String password) {
			Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
			Matcher matcher = pattern.matcher(password);
			return matcher.find();
		}
		
		public String analyzeMood(String message) {
			if (message.contains("Happy")) {
				System.out.println("User Registration Successfull");
				return "Happy";
			}
			else {
				System.out.println("User Registration Not Successfull");
				return "SAD";
			}
		}
}
