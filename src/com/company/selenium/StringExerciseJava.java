package com.company.selenium;

public class StringExerciseJava {

	public static void main(String[] args) {
		
		//declare & define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		
		
		//declare & define only the size of the array
		String[] states = new String[5];
		states[0]="California";
		states[1]="Ohio";
		
		//declare array
		String[] countries;
		
		//initialize the array
		countries = new String[5];
		
		//define the array
		countries[0]= "USA";
		
		String bookTitle = "The lord of the rings";
		String wordChoice= "ring";
		if(bookTitle.contains("ring")) {
			System.out.println("The book contains the word" + wordChoice);
		}
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Shalmali";
		String lastName = "Lokhande";
		String SSN = "7144069816";
		
		System.out.println("There are " + SSN.length() + "digits in your SSN");
		
		System.out.println(firstName.substring(2, 6));
		System.out.println(lastName.substring(0, 1));
		System.out.println(SSN.substring(5));
		
		
	}

}
