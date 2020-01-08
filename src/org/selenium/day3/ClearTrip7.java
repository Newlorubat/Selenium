package org.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip7 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/trains");
		
		WebElement FromStation = driver.findElement(By.id("from_station"));
		FromStation.sendKeys("Madurai Junction (MDU)");
		
		
		WebElement ToStation = driver.findElement(By.id("to_station"));
		ToStation.sendKeys("Chennai Beach (MSB)");
		
		WebElement Dropdown = driver.findElement(By.id("trainClass"));
		Select select = new Select(Dropdown);
	    select.selectByVisibleText("Sleeper (SL)");
	    
	    
	    WebElement fromDateBox= driver.findElement(By.id("dpt_date"));
	    fromDateBox.clear();
	    fromDateBox.sendKeys("15/12/2019");
	    
	    
	    WebElement Dropdown1 = driver.findElement(By.id("train_adults"));
		Select Adults= new Select(Dropdown1);
	    Adults.selectByVisibleText("4");
	    
	    WebElement Dropdown2 = driver.findElement(By.id("train_children"));
		Select Children= new Select(Dropdown2);
	    Children.selectByVisibleText("4");
	    
	    WebElement Dropdown3 = driver.findElement(By.id("train_male_seniors"));
		Select SeniorMen= new Select(Dropdown3);
	    SeniorMen.selectByVisibleText("3");
	    
	    WebElement Dropdown4 = driver.findElement(By.id("train_female_seniors"));
	    Select SeniorWomen = new Select(Dropdown4);
	    SeniorWomen.selectByVisibleText("2");
	    
	    WebElement SearchTrains = driver.findElement(By.id("trainFormButton"));
		SearchTrains.click();
	    
	}

}
