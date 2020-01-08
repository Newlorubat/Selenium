package org.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id ='email']"));
		txtUserName.sendKeys("newlonrubat");
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id ='pass']"));
		txtPassword.sendKeys("newlonrubat,1");
		
		WebElement txtLogin = driver.findElement(By.xpath("//input[@type ='submit']"));
		txtLogin.click();
		
		
	}

}
