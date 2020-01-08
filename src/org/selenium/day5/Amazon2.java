package org.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement Hamburgermenu = driver.findElement(By.id("nav-hamburger-menu"));
		Hamburgermenu.click();
		
		WebElement Mobiles = driver.findElement(By.xpath("//a[@data-menu-id ='7']"));
		Mobiles.click();
		
		WebElement PowerBanks = driver.findElement(By.xpath("//a[contains(@href, 'mobcomp_powerbank')]"));
		PowerBanks.click();
		
		
		
	}

}
