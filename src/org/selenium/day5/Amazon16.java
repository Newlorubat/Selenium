package org.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon16 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement signin = driver.findElement(By.xpath("//span[text() = 'Hello. Sign in']"));
		act.moveToElement(signin).perform();

		WebElement starthere = driver.findElement(By.xpath("(//a[text() ='Start here.'])[1]"));
		starthere.click();

		WebElement name = driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("Newlonrubat");

		WebElement phone = driver.findElement(By.id("ap_phone_number"));
		phone.sendKeys("9790478928");

		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("newlonrubat@gmail.com");      
		
		WebElement Password = driver.findElement(By.id("ap_password"));
		Password.sendKeys("newlonrubat");  






	}

}
