package org.selenium.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
	    //WebElement LinkPartial = driver.findElement(By.partialLinkText("Partial Link Test"));
	    //LinkPartial.click();
		
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@name ='firstname']"));
		txtFirstName.sendKeys("Tester");
		
		WebElement txtLastName = driver.findElement(By.xpath("//input[@id ='lastname']"));
		txtLastName.sendKeys("Testing");
		
		WebElement rdoGender = driver.findElement(By.id("sex-0"));
	    rdoGender.click();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement rdoExp = driver.findElement(By.xpath("//*[@id=\"exp-3\"]"));   
	    rdoExp.click();
	    
	    WebElement txtdatePicker = driver.findElement(By.id("datepicker"));
	    txtdatePicker.sendKeys("20-Dec-2019");
	    
	    WebElement CheckAutomation = driver.findElement(By.id("profession-1"));
	    CheckAutomation.click();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement CheckTool1  = driver.findElement(By.id("tool-1"));
	    CheckTool1.click();
	    
	    WebElement CheckTool  = driver.findElement(By.id("tool-2"));
	    CheckTool.click();
	    
	    
	    
	    
	    
	}

}
