package org.selenium.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail13 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement FirstName = driver.findElement(By.id("firstName"));
	    FirstName.sendKeys("Newlonrubat");
		String Text1 = FirstName.getAttribute("value");
		System.out.println(Text1);
		
		WebElement LastName = driver.findElement(By.id("lastName"));
		LastName.sendKeys("Remington");
		String Text2 = LastName.getAttribute("value");
		System.out.println(Text2);
		
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("newlonrubat1");
		String Text3 = UserName.getAttribute("value");
		System.out.println(Text3);
		
		WebElement Password = driver.findElement(By.name("Passwd"));
		Password.sendKeys("Hairuban");
		String Text4 = Password.getAttribute("value");
		System.out.println(Text4);
		
		WebElement Confirm = driver.findElement(By.name("ConfirmPasswd"));
		Confirm.sendKeys("Thankyou");
		String Text5 = Confirm.getAttribute("value");
		System.out.println(Text5);
	}

}
