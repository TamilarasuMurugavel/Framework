package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TAMILARASU M\\eclipse-workspace\\JavaSeleniumDay1Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement txtFrom = driver.findElement(By.id("src"));
		txtFrom.sendKeys("Coimbatore");
		WebElement txtTo = driver.findElement(By.id("dest"));
		txtTo.sendKeys("chennai");
		
	
	
	}

}
