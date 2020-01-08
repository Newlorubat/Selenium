package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		
		WebElement close = driver.findElement(By.xpath("(//button[@class ='_2AkmmA _29YdH8'])"));
		close.click();
		
		WebElement Hamburgermenu = driver.findElement(By.xpath("(//span[@class ='_1QZ6fC _3Lgyp8'])[6]"));
		Actions homeappliance = new Actions(driver);
		homeappliance.moveToElement(Hamburgermenu).perform();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement submenu = driver.findElement(By.xpath("(//a[@title ='Sofa'])"));
		submenu.click();
		
		WebElement addcart = driver.findElement(By.xpath("(//img[@alt ='Fresh@Fashion DREAM Airsofa PVC 3 Seater Inflatable Sofa'])"));
		addcart.click();
		

	}

}
