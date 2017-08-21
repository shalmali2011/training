package com.company.selenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.amazon.com/");
		
		//Actions -- used to account for mouse movements, keyboard actions
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		Thread.sleep(3000L); //just to be able to see
		driver.findElement(By.xpath("//span[text() = 'Sign In']")).click();
		

	}

}
