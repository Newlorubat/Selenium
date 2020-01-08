package org.seleium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		//driver.manage().window().maximize();
		WebElement txtUserName = driver.findElement(By.id("src"));
		txtUserName.sendKeys("Chennai");
		WebElement txtPassword = driver.findElement(By.id("dest"));
		txtPassword.sendKeys("Manamelkudi");
	}

}
