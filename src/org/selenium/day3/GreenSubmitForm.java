package org.selenium.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenSubmitForm {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		WebElement btnContactUs = driver.findElement(By.xpath("//a[text() ='CONTACT US']"));
		btnContactUs.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement txtName = driver.findElement(By.id("InputName"));	
		txtName.sendKeys("Tester");
		
		WebElement txtEmail = driver.findElement(By.id("InputEmail1"));
		txtEmail.sendKeys("Ruban.1@gmail.com");
		
		WebElement txtMobileNumber = driver.findElement(By.id("InputSubject"));
		txtMobileNumber.sendKeys("9898787678");
		
		WebElement txtMessage = driver.findElement(By.xpath("(//textarea[@name = 'comments'])[1]"));
		txtMessage.sendKeys("Hai iam tester from greensTech");
		
		WebElement btnSubmitNow = driver.findElement(By.id("submit"));
	    btnSubmitNow.click();
	}

}
