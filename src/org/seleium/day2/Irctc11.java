package org.seleium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Irctc11 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		WebElement txtFrom = driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input"));
		txtFrom.sendKeys("MADURAI JN - MDU");
		WebElement txtTo = driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input"));
		txtTo.sendKeys("CHENNAI EGMORE - MS");
	}

}
