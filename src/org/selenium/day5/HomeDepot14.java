package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot14 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement allDepartment = driver.findElement(By.xpath("//a[@data-id ='departmentsFlyout']"));
        act.moveToElement(allDepartment).perform();
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement Paint = driver.findElement(By.xpath("//a[text() = 'Paint']"));
        act.moveToElement(Paint).perform();
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement Interior = driver.findElement(By.xpath("//a[text() = 'Interior Paint']"));
        act.moveToElement(Interior).perform();
        
        WebElement Celling = driver.findElement(By.xpath("//a[text() = 'Ceiling Paint']"));
        Celling.click();

	}

}
