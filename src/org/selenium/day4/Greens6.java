package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens6 {

	public static void main(String[] args) {
	  
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/testimonial.html");
		WebElement drive = driver.findElement(By.xpath("//strong[text() ='Sekhar C (Infosys, Chennai) :']"));
		String Para = drive.getText();
		System.out.println(Para);
	}

}
