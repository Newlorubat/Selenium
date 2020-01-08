package org.selenium.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens4 {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		WebElement contactUs = driver.findElement(By.xpath("//a[text() = 'CONTACT US']"));
		Actions act = new Actions(driver);
		act.contextClick(contactUs).perform();

		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);

		String parent = driver.getWindowHandle();

		Set<String> allWindow = driver.getWindowHandles();
		for (String newWIndow : allWindow) {

			if(!parent.equals(newWIndow))
			{
				driver.switchTo().window(newWIndow);
			}

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement print = driver.findElement(By.xpath("(//div[@class ='address-block address-border'])[2]"));
		String text = print.getText();
		System.out.println(text);

	}
}
