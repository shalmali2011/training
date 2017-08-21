package com.company.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleMultipleBrowsers {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String originalWindow = driver.getWindowHandle();
		
		System.out.println("originalWin Handle:" + originalWindow);
		//driver.manage().timeouts().pageLoadTimeout(60L, TimeUnit.SECONDS); //wait until 60 seconds..can be done in less than 60 seconds
		//driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		driver.navigate().to("http://www.hsbc.co.in/1/2/homepage");
		Thread.sleep(3000L);
		
		driver.findElement(By.xpath("//a[@title = 'Close']")).click();
		Thread.sleep(3000L);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Call Us")).click();
		
		//new window will open
		Set<String> allHandles = driver.getWindowHandles();
		allHandles.remove(originalWindow);
		String secondWin = allHandles.iterator().next();
		//switch to pop up window
		driver.switchTo().window("secondWin");

	}

}
