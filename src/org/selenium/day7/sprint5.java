package org.selenium.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sprint5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sprint.com/");
		
		WebElement login = driver.findElement(By.xpath("(//a[@class ='sprint-brand-header-menu radius-s'])[2]"));
		login.click();
		
		WebElement signin = driver.findElement(By.id("loginHeaderButton"));
		signin.click();

	}

}
