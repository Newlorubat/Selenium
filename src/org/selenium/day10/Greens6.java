package org.selenium.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens6 {

	public static void main(String[] args) throws IOException, AWTException {

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
		
		WebElement clickCourse = driver.findElement(By.xpath("//a[@href ='courses.html']"));
		act.moveToElement(clickCourse).perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement oracleTraining = driver.findElement(By.xpath("//a[@href ='oracle-training.html']"));
		oracleTraining.click();
		
		//WebElement close = driver.findElement(By.xpath("//button[@class ='close']"));
		//close.click();
		
		//Screenshots
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
	   
		//Temp
		File Source = screenshot.getScreenshotAs(OutputType.FILE);
		
		//Desination
		
		File Desination = new File("D:\\Selenium\\SeleniumScreen\\Second.png");
		
		//CopyFile
		
		FileUtils.copyFile(Source, Desination);
		
		
		
		
		

	}

	}


