package ch01_prj1_StudentRegistration;

import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
	// Welcome Message
		System.out.println("Student Registration");
		System.out.println(); // print a blank line;
		
	// Create Scanner object and initialize variables
		Scanner sc = new Scanner(System.in);
		
	// Get User input firstName
		System.out.print("Enter first name:   ");
		String firstName = sc.next();
		
	// Get User input lastName
		System.out.print("Enter last name:   ");
		String lastName = sc.next();
		
	// Get User input yearofBirth
		System.out.print("Enter year of birth:   ");
		int yearBirth = sc.nextInt();
		
	// Print Student First and Last Name to Console
		System.out.println();
		String welcomeMessage = "Welcome " + firstName + " " + lastName + "!" + "\n" +
							 "Your registration is complete." + "\n" +
							 "Your temporary password is " + firstName + "*" + yearBirth;
		System.out.println(welcomeMessage);
	}
	

}

