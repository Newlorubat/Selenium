package org.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal13 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
		WebElement mobileTablet = driver.findElement(By.xpath("//span[text() = 'Mobile & Tablets']"));
        act.moveToElement(mobileTablet).perform();
        
		WebElement covers = driver.findElement(By.xpath("//span[text() = 'New Launches Covers']"));
        covers.click();
        
	}

}
