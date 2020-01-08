package org.seleium.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swiggy8 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		WebElement txtUser = driver.findElement(By.id("location"));
		txtUser.sendKeys("Manamelkudi");
	}

}
