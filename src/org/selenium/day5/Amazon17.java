package org.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon17 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Menu = driver.findElement(By.xpath("//a[@id = 'nav-hamburger-menu']"));
		Menu.click();
		
		WebElement Men = driver.findElement(By.xpath("//a[@data-menu-id = '9']"));
		Men.click();
		
		WebElement Sunglasses = driver.findElement(By.xpath("//a[contains(@href , 'sbc_mfashion_sunglasses')]"));
		Sunglasses.click();
	}

}
