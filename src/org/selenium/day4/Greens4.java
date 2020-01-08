package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html ");
		WebElement drive = driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]"));
		String Para = drive.getText();
		System.out.println(Para);

	}

}
