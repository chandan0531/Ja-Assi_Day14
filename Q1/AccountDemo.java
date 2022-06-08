package com.Assi.Q1;

public class AccountDemo {
	
	public static void main(String[] args) {
		
		Account ac = new Account("123456789");
		
//		ac.setBalance(2000000.0);
		ac.deposit(200000.0);
		
		
		
		try {
			double blnAmount = ac.withdraw(5000.0);
//			System.out.println(blnAmount);
		} catch (InsufficientFundsException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
		
		
//		System.out.println(ac.getAccountNumber());
//		System.out.println(ac.getBalance());
		
	
		
	}
}
