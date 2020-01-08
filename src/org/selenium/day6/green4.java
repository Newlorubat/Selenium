package org.selenium.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class green4 {

		public static void main(String[] args) throws AWTException {
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
		
			WebElement test1 = driver.findElement(By.xpath("//button[@class ='_2AkmmA _29YdH8']"));
			test1.click();
			Actions action = new Actions(driver);
			WebElement test = driver.findElement(By.xpath("//a[text() ='Login & Signup']"));
			action.contextClick(test).perform();
			
			Robot robert = new Robot();
			for(int i=1;i<=2;i++)
			{
			robert.keyPress(KeyEvent.VK_DOWN);
			robert.keyRelease(KeyEvent.VK_DOWN);
			}
			
			robert.keyPress(KeyEvent.VK_ENTER);
	}

}
