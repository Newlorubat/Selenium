package org.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");

		WebElement btnsignsignup = driver.findElement(By.id("i-icon-profile"));
		btnsignsignup.click();

		WebElement btnsign = driver.findElement(By.id("signInLink"));
		btnsign.click();

		
	}

}
