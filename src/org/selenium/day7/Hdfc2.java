package org.selenium.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		//WebElement Login = driver.findElement(By.xpath("//frame[@name ='login_page']"));
		//driver.switchTo().frame(Login);
		
		driver.switchTo().frame("login_page");
		/*WebElement sendkeys = driver.findElement(By.xpath("//input[@name ='fldLoginUserId']"));
		sendkeys.sendKeys("9790478928");*/
		
		WebElement sendkeys = driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
		sendkeys.click();
	}

}
