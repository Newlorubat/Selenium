package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensOracle8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
      	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    WebElement close = driver.findElement(By.xpath("//button[@class='close']"));
		close.click();
	    
		WebElement course = driver.findElement(By.xpath("//a[@class='activeLink']"));
	    Actions action = new Actions(driver);
	    action.moveToElement(course).perform();
	    
	    WebElement software = driver.findElement(By.xpath("// span[text() ='Oracle Training']"));
	    action.moveToElement(software).perform();
	    
	    WebElement sql = driver.findElement(By.xpath("//span[text() ='Oracle SQL Training']"));
	    sql.click();
	    
	    WebElement Third = driver.findElement(By.xpath("//h2[contains(text(),'Oracle SQL Coures contents ')]"));
	    String text = Third.getText();
	    System.out.println(text);
	  
	}

	}


