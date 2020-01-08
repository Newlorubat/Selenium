package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefoxdemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://selenium.dev/downloads/");
		String str = driver.getTitle();
		System.out.println(str);
		
		driver.close();
	}

}
