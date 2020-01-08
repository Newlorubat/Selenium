package org.seleium.day2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactIn12 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("newlonrubat@gmail.com");
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("Ruban"); 
	}

}
