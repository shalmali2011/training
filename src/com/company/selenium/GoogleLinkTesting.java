package com.company.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLinkTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().pageLoadTimeout(60L, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30L,  TimeUnit.SECONDS);
		driver.navigate().to("http://www.google.com/");
		
		//Find all the links on google.com
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		
		int numOfLinks = allLinks.size();
		System.out.println("Total number of links in the list" + numOfLinks);
		
		for(int i=0; i<numOfLinks; i++){
			WebElement LinkElement=allLinks.get(i);
			String url = LinkElement.getAttribute("href");
			System.out.println(i + "---" + url);
		}
		
		driver.quit();
		
		
	}

}
