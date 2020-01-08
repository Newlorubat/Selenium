package org.selenium.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdeal12 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Search = driver.findElement(By.id("inputValEnter"));
		Search.sendKeys("Chappal Man");
		
		WebElement Click = driver.findElement(By.xpath("//button[@class ='searchformButton col-xs-4 rippleGrey']"));
		Click.click();
		
		WebElement Product = driver.findElement(By.xpath("//img[@title ='UNIK Black Kolhapuri Chappal']"));
		Product.click();
		
		
		
		
	}

}
