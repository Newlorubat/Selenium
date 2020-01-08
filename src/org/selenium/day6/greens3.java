package org.selenium.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class greens3 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		
		Actions acc = new Actions(driver);
		WebElement path = driver.findElement(By.xpath("(//p[@style = 'text-align:justify; font-size:18px;'])[2]"));
       
		acc.doubleClick(path).perform();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		acc.contextClick(path).perform();
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Robot obj = new Robot();
		
		for(int i=1;i<=3;i++)
		{
		obj.keyPress(KeyEvent.VK_DOWN);
		
		}
		obj.keyPress(KeyEvent.VK_ENTER);
	}
	
}
