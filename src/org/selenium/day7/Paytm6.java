package org.selenium.day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");

		WebElement login = driver.findElement(By.xpath("//div[text() ='Log In/Sign Up']"));
		login.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement frames = driver.findElement(By.xpath("//iframe[contains(@src,'isIframe=true&theme=mp-web')]"));
		driver.switchTo().frame(frames);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement signup = driver.findElement(By.xpath("//span[text() ='Login/Signup with mobile number and password']"));
		signup.click();
		
		WebElement loginSecure = driver.findElement(By.xpath("//span[@class ='ng-scope']"));
		loginSecure.click();
		
		
		
	

	}

}
