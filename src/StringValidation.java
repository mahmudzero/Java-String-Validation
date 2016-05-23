import java.util.*;

public class StringValidation {
	public StringValidation() {
		System.out.println("Do you want to fill out the form? (Y)es/(N)o");
		String answer = scanner.nextLine();
		if(answer.equalsIgnoreCase("y")) {
			validateFirstName();
			validateLastName();
			validateEmail();
			validateGender();
			validateSSN();
			validateDOB();
			System.out.println("Thank you for filling out the form!");
		} else {
			System.out.println("Okay, thanks for your response.");
		}
	}
	private Scanner scanner = new Scanner(System.in);
	private String regex;
	
	
	public void validateFirstName() {
		
		regex = "^[a-zA-Z]+$";
		System.out.println("What is your First Name? [John]");
		String name = scanner.nextLine();
		if (name.matches(regex)) {
			//validateLastName();
		} else {
			System.out.println("Invalid Entry for Field [First Name]\nPlease input a valid entry\n");
			validateFirstName();
		}
	}
	
	public void validateLastName() {
		regex = "^[a-zA-Z]+$";
		System.out.println("What is your Last Name? [Appleseed]");
		String name = scanner.nextLine();
		if (name.matches(regex)) {
			//validateEmail();
		} else {
			System.out.println("Invalid Entry for Field [Last Name]\nPlease input a valid entry\n");
			validateLastName();
		}
	}
	
	public void validateEmail() {
		regex = "\\b[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}\\b";
		System.out.println("What is your email address? [johnappleseed@example.com]");
		String email = scanner.nextLine();
		if (email.matches(regex)) {
			//validateGender();
		} else {
			System.out.println("Invalid Entry for Field [Email Address]\nPlease input a valid entry\n");
			validateEmail();
		}
	}
	
	public void validateGender() {
		System.out.println("What is your gender? [Male, Female, N/A]");
		String gender = scanner.nextLine();
		if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("n/a")) {
			//validateSSN();
		} else {
			System.out.println("Invalid Entry for Field [Gender]\nPlease input a valid entry\n");
			validateGender();
		}
	}
	
	public void validateSSN() {
		regex = "\\b[0-9]{3}+-[0-9]{2}+-[0-9]{4}\\b";
		System.out.println("What is your SSN? [xxx-xx-xxxx]");
		String ssn = scanner.nextLine();
		if (!ssn.matches(regex)) {
			System.out.println("Invalid Entry for Field [SSN]\nPlease input a valid entry\n");
			validateSSN();
		}
	}
	
	public void validateDOB() {
		regex = "^(0[1-9]|1[0-2])+/(0[1-9]|1[0-9]|2[0-9]|3[0-1])+/([19|20]+[0-9]{2})+$";
		System.out.println("What is your date of birth? [mm/dd/yyyy]");
		String dob = scanner.nextLine();
		if (!dob.matches(regex)) {
			System.out.println("Invalid Entry for Field [Date of Birth]\nPlease input a valid entry\n");
			validateDOB();
		}
	}
}
