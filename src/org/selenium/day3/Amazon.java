package org.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/register?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
		
		WebElement Name = driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]"));
		Name.sendKeys("ruban");
		
		WebElement mobilenumber = driver.findElement(By.xpath("//*[@id=\"ap_phone_number\"]"));
		mobilenumber.sendKeys("9790987876");
	
		WebElement email = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		email.sendKeys("newlorubat@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		password.sendKeys("kfsfd");
	}
	

}
