package org.selenium.day4;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google9 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement drive = driver.findElement(By.xpath("//a[@title = 'Google apps']"));
		drive.click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement drive1 = driver.findElement(By.xpath("//span[@pid = '78']"));
		drive1.click();

	}

}
