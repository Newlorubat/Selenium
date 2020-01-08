package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver","");
		WebDriver driver = new InternetExplorerDriver ();
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		String str = driver.getTitle();
		System.out.println(str);
		
		driver.close();
	}

}
