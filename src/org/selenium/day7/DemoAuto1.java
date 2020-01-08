package org.selenium.day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAuto1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		/*WebElement normalAlert = driver.findElement(By.xpath("//button[@class = 'btn btn-danger']"));
		normalAlert.click();
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		System.out.println(text);
		alt.accept();*/


		WebElement alert = driver.findElement(By.xpath("//a[@href = '#Textbox']"));
		alert.click();
		WebElement normalAlert = driver.findElement(By.xpath("//button[@class = 'btn btn-info']"));
		normalAlert.click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("hai ruban how are you");
		alt.accept();

	}

}
