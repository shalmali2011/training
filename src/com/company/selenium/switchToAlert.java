package com.company.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchToAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.rediffmail.com/cgi-bin/login.cgi");;
		driver.findElement(By.name("proceed")).sendKeys(Keys.ENTER);
		Thread.sleep(3000L);
		//Alert will be present
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();
		
		//driver.quit();
		

	}

}
