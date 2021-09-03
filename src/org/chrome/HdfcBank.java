package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TAMILARASU M\\eclipse-workspace\\JavaSeleniumDay1Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		WebElement txtCustomerId = driver.findElement(By.name("fldLoginUserId"));
		txtCustomerId.sendKeys("Tamilarasu14345");
	}

}
