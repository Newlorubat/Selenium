package org.selenium.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homedepot3 {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");
		WebElement search = driver.findElement(By.id("headerSearch"));
	    search.sendKeys("Celling Fan");
		
	    Robot rj = new Robot();
		rj.keyPress(KeyEvent.VK_ENTER);
		rj.keyRelease(KeyEvent.VK_ENTER);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Fan = driver.findElement(By.xpath("//img[contains(@title,'Kensgrove 72 in. LED Indoor/Outdoor')]"));
	    Fan.click();
	    
	    WebElement Cart = driver.findElement(By.xpath("//button[@id = 'atc_shipIt']"));
	    Cart.click();
	  
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement frames = driver.findElement(By.xpath("//iframe[@class ='thd-overlay-frame']"));
	    driver.switchTo().frame(frames);
	    
	    WebElement Click = driver.findElement(By.xpath("//div[@class = 'price u__inline']"));
	    String text = Click.getText();
	    System.out.println(text);
	   
	}

}
