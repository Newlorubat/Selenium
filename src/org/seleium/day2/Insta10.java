package org.seleium.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta10 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement txtUser = driver.findElement(By.name("username"));
		txtUser.sendKeys("newlonrubat@gmail.com");
		WebElement txtPass = driver.findElement(By.name("password"));
		txtPass.sendKeys("Ruban"); 
	}

}
