package com.Assi.Q1;

public class Account {
	
	private String accountNumber;
	private double balance;
	
	
	public void deposit(double amount) {
		
		this.balance = balance + amount;
	}
	
	public double withdraw(double amount) throws InsufficientFundsException {
		double remaingBlance = 0;
		if(this.balance>=amount)
		{
			remaingBlance = this.balance - amount;
			System.out.println("Reamaing balance : " + remaingBlance);
			return remaingBlance;
		}
		else
		{
			InsufficientFundsException ife = new InsufficientFundsException("balance low");
			throw ife;
		}
		
//		return remaingBlance;
	}

	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
