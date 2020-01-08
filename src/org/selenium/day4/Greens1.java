package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens1 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com ");
		WebElement Gettext = driver.findElement(By.xpath("//h2[text() = 'Greens Technologys Overall Reviews']"));
		String review = Gettext.getText();
		System.out.println(review);
	}

}
