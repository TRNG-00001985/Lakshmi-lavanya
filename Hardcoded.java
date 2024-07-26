package com.studyopedia;
import java.util.Scanner;
public class Hardcoded {
		    // Hard-coded username and password
		    private static final String USERNAME = "admin";
		    private static final String PASSWORD = "password123";

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter username: ");
		        String inputUsername = scanner.nextLine();
		        System.out.print("Enter password: ");
		        String inputPassword = scanner.nextLine();
	if (authenticate(inputUsername, inputPassword)) {
		System.out.println("Login successful!");
	} 
	else 
	{
	System.out.println("Login failed. Incorrect username or  password.");
	}
	scanner.close();
	}
	private static boolean authenticate(String username, String 
	        password) {
	return USERNAME.equals(username) && PASSWORD.equals(password
	            );
	}


}
