package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TAMILARASU M\\eclipse-workspace\\JavaSeleniumDay1Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("9597871308");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("tamilkking");
	}

}
