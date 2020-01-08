package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTech3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/oracle-training.html ");
		WebElement drive = driver.findElement(By.xpath("//p[contains(text(),'Awarded as the ')]"));
		String Para = drive.getText();
		System.out.println(Para);
		
		WebElement drive1 = driver.findElement(By.xpath("//p[contains(text(),'Rated as ')]"));
		String Para1 = drive1.getText();
		System.out.println(Para1);
	}
	}


