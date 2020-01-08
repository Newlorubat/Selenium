package org.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettyimage4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gettyimages.in/");
		
		WebElement Hamburgermenu = driver.findElement(By.xpath("(//a[@class ='text-link--sly action--with-emphasis'])[1]"));
		Hamburgermenu.click();
		
		WebElement submenu = driver.findElement(By.xpath("//a[text() ='Entertainment']"));
		submenu.click();
		
		
		
		

	}

}
