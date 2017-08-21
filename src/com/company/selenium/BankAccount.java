package com.company.selenium;

public class BankAccount implements IRate {
	//define variables
	//static variable
	static String routingNumber = "06482";
	
	//instance variable
	double balance;
	String accountNumber;
	String name;
	String ssn;
	String accountType;
	
	BankAccount(){
		System.out.println("New Account Created");
	}
	
	BankAccount(String accountType){
		System.out.println("New account of type " + accountType + " created");
	}
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("New account of type " + accountType + " created");
		System.out.println("Initial deposit " + initDeposit);
		
		
		//initDeposit, msg, accountType are local variables
		
		String msg = null;
		
		if(initDeposit < 1000) {
			msg = "deposit less than 1000";
		}
		else {
			msg="Thanks for inital deposit";
		}
		System.out.println(msg);
		balance = initDeposit;
		
		
	}
	
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		
	}
	
	//interface methods implemented
	@Override
	public void setRate() {
		System.out.println("Setting Rate");
	}
	
	@Override
	public void increaseRate() {
		System.out.println("Increasing Rate");
	}
	
	
}
