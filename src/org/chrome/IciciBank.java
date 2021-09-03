package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\TAMILARASU M\\eclipse-workspace\\JavaSeleniumDay1Task\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
WebElement txtUsername = driver.findElement(By.xpath("//input[@name='DUMMY1']"));
txtUsername.sendKeys("tamilarasu");
Thread.sleep(3000);
WebElement txtPassword = driver.findElement(By.xpath("(//input[@size='28'])[2]"));
txtPassword.sendKeys("12525");


	}

}
