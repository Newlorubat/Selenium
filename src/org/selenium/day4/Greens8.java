package org.selenium.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens8 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		WebElement drive = driver.findElement(By.name("q"));
		drive.sendKeys("greens velmurugan");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement drive1 = driver.findElement(By.xpath("//span[text() ='greens velmurugan']"));
		drive1.click();

	}

}
