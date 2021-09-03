package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TAMILARASU M\\eclipse-workspace\\JavaSeleniumDay1Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		driver.manage().window().maximize();
	WebElement txtUsername = driver.findElement(By.xpath("//input[@name='username']"));
	txtUsername.sendKeys("tamil@12356");
	WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
	txtPassword.sendKeys("956566");
	}

}
