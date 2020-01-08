package org.selenium.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google2 {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp");
		WebElement apps = driver.findElement(By.xpath("//a[@title = \"Google apps\"]"));
		apps.click();
		
		Robot sapps = new Robot();
		for(int i=1;i<=7;i++)
		{
		sapps.keyPress(KeyEvent.VK_TAB);
		sapps.keyRelease(KeyEvent.VK_TAB);

		
		}
		
		sapps.keyPress(KeyEvent.VK_ENTER);
		
	}

}
