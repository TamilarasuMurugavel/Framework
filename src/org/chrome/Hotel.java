package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TAMILARASU M\\eclipse-workspace\\JavaSeleniumDay1Task\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://adactinhotelapp.com/");
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("tamil1995");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("mkuj2232");
		
		
	}

}
