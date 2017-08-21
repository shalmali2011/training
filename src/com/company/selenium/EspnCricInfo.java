package com.company.selenium;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EspnCricInfo {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.espncricinfo.com/");
		
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//span[text() = 'Result']")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 30L);
		//wait.ignoring(NoSuchElementException.class).pollingEvery(1, TimeUnit.SECONDS)
		//.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text() = 'Scorecard']")));
		Thread.sleep(3000L);
		
		driver.findElement(By.xpath("//div[@class='tertiary-nav-container']//ul[@class='first-group']//li[@class='sub active']//a[@class='scorecard react-router-link']")).click();
		//Thread.sleep(3000L);
		
		//print table data 
		//WebElement table = driver.findElement(By.xpath("//div[@class='scorecard-section batsmen']"));
		
		//Get all rows
		//List<WebElement> rows = table.findElements(By.xpath("//div[@class='scorecard-section batsmen'][@data-reactid='.1yvqp56l0jk.4.0.1.0.0.$0.0.0.1.0']//div[@class='flex-row']"));
		
		
		WebElement cName = driver.findElement(By.xpath("//div[@class='scorecard-section batsmen'][@data-reactid='.1yvqp56l0jk.4.0.1.0.0.$0.0.0.1.0']//div[@class='flex-row']//div[@class='wrap batsmen']//div[@class='cell batsmen']//a[text()]"));
		System.out.println(cName.getText());

	}

}
//a[@class = 'scorecard react-router-link
