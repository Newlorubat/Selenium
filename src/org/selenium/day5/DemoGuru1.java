package org.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuru1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement Source = driver.findElement(By.xpath("(//a[@class = 'button button-orange'])[5]"));
		WebElement Destination = driver.findElement(By.xpath("(//li[@class = 'placeholder'])[1]"));
		
		WebElement Source1 = driver.findElement(By.xpath("(//li[@id = 'fourth'])[2]"));
		WebElement Destination1 = driver.findElement(By.xpath("(//li[@class = 'placeholder'])[2]"));
		
		
		WebElement Source2 = driver.findElement(By.xpath("(//li[@class = 'block15 ui-draggable'])"));
		WebElement Destination2 = driver.findElement(By.xpath("(//li[@class = 'placeholder'])[3]"));
		
		WebElement Source3 = driver.findElement(By.xpath("(//li[@class = 'block13 ui-draggable'])[1]"));
		WebElement Destination3 = driver.findElement(By.xpath("(//li[@class = 'placeholder'])[4]"));
		
		
		Actions action = new Actions(driver);
		action.dragAndDrop(Source, Destination).perform();
		action.dragAndDrop(Source1, Destination1).perform();
		action.dragAndDrop(Source2, Destination2).perform();
		action.dragAndDrop(Source3, Destination3).perform();

        		

	}

}
