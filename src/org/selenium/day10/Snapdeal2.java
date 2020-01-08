package org.selenium.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal2 {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		WebElement search = driver.findElement(By.id("inputValEnter"));
	    search.sendKeys("Iphone 7 pro");
	    
	    Robot cls = new Robot();
	    
	    cls.keyPress(KeyEvent.VK_ENTER);
	    cls.keyRelease(KeyEvent.VK_ENTER);
	    
	    WebElement Click = driver.findElement(By.xpath("(//p[text() ='Apple iPhone 7 ( 32GB , 2 GB ) Black'])[1]"));
	    Click.click();
	    
	    String parent = driver.getWindowHandle();
	    
	    Set<String> allWindows = driver.getWindowHandles();
	    
	    for (String newWindow : allWindows) {
	    	
	    	if(!parent.equals(newWindow))
	    	{
	    		driver.switchTo().window(newWindow);
	    	}
				
		}
	    WebElement Click1 = driver.findElement(By.xpath("//span[text() ='add to cart']"));
	    Click1.click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement print = driver.findElement(By.xpath("(//span[@class = 'price'])[2]"));
	    String text = print.getText();
	    System.out.println(text);
	    
	    
	    
	    
	    
	    
	}

}
