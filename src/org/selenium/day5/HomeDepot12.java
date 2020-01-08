package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot12 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement allDepartment = driver.findElement(By.xpath("//a[@data-id ='departmentsFlyout']"));
        act.moveToElement(allDepartment).perform();
        
        WebElement heatCool = driver.findElement(By.xpath("//a[@data-level ='Heating & Cooling']"));
        act.moveToElement(heatCool).perform();
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement airCondition = driver.findElement(By.xpath("//a[@title ='Air Conditioners']"));
        act.moveToElement(airCondition).perform();
        
        WebElement portable = driver.findElement(By.xpath("//a[@title ='Portable Air Conditioners']"));
        portable.click();
        
      
	}
}
