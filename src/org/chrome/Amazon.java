package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TAMILARASU M\\eclipse-workspace\\JavaSeleniumDay1Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtSearchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtSearchbox.sendKeys("iphone");
		WebElement btnSearch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btnSearch.click();
	}

}
