package com.company.selenium;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		acc1.routingNumber = "9847";
		System.out.println(acc1.routingNumber);
		BankAccount acc2 = new BankAccount("Checking account");

	}

}
