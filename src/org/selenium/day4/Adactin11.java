package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin11 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("Ruban");
		String values = UserName.getAttribute("value");
		System.out.println(values);
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Remington");
		String values1 = Password.getAttribute("value");
		System.out.println(values1);
		
	}

}
