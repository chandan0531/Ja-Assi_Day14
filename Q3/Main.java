/*
 * Q3) Explain Finally and Final Keyword with an Example?
 * 
 * Final Keyword -> Final keyword is used to declared the class name, variable and method.
 * 
 * Finally Keyword -> Finally Keyword is used to close the application after execution of all code.
 */

package com.Assi.Q3;

public class Main {
	
	
	public static void main(String[] args) {
		
		try {
			System.out.println(100/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Application end");
		}
	}
}
