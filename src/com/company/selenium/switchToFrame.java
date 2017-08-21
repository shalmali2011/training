package com.company.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchToFrame {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().pageLoadTimeout(60L, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);  
		
		
		driver.navigate().to("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		Thread.sleep(3000L);
		//switch to iframe - iframe inside an iframe -- generally hard to see.. so look at html(tab) code in firebug
		driver.switchTo().frame("iframe").switchTo().frame(0);
		//Thread.sleep(3000L);
		
		//click learnHTML
		driver.findElement(By.linkText("Learn HTML")).click();
		Thread.sleep(3000L);

	}

}
