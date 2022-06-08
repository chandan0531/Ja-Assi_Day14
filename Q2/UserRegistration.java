package com.Assi.Q2;

import java.util.Scanner;

public class UserRegistration {
	
	public void registerUser(String username,String userCountry)throws InvalidCountryException {
		
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		}
		else
		{
			InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Applition start");
		
		UserRegistration ur = new UserRegistration();
		System.out.println("Enter Your Name");
		Scanner scn = new Scanner(System.in);

		String userName = scn.next();
		
		System.out.println("Enter Your Country");
		String userCountry = scn.next();
		
		try {
			ur.registerUser(userName, userCountry);
		} catch (InvalidCountryException e) {
			
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Applition end");
		}
	}
}
