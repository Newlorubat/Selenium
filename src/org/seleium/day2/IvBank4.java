package org.seleium.day2;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IvBank4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lvbankonline.in/index.html?module=login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement txtUserName = driver.findElement(By.id("login_username|input"));
		txtUserName.sendKeys("Ruban");
		WebElement txtPassword = driver.findElement(By.id("login_password|input"));
		txtPassword.sendKeys("Password");
	}

}
