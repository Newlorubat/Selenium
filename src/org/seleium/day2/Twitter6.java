package org.seleium.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter6 {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement txtUser = driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/fieldset/div[1]/input"));
		txtUser.sendKeys("newlonrubat@gmail.com");
		WebElement txtPass = driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/fieldset/div[2]/input"));
		txtPass.sendKeys("Ruban"); 
	}

}
