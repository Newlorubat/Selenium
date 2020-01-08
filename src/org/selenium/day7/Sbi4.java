package org.selenium.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		

		WebElement Login = driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[3]"));
	    Login.click();
	    
	    WebElement submit = driver.findElement(By.xpath("(//input[@class ='btn btn-default'])[1]"));
	    submit.click();
        
	    //Alert alt = driver.switchTo().alert();
	    //alt.accept();
	    
	}

}
