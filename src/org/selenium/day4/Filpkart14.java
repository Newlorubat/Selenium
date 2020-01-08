package org.selenium.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpkart14 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Electronics = driver.findElement(By.xpath("//span[text() = 'Electronics']"));
		String Text1 = Electronics.getText();
		System.out.println(Text1);
		
		WebElement Tv = driver.findElement(By.xpath("//span[text() = 'TVs & Appliances']"));
		String Text2 = Tv.getText();
		System.out.println(Text2);
		
		WebElement Men = driver.findElement(By.xpath("//span[text() = 'Men']"));
		String Text3 = Men.getText();
		System.out.println(Text3);
		
		WebElement Women = driver.findElement(By.xpath("//span[text() = 'Women']"));
		String Text4 = Women.getText();
		System.out.println(Text4);
		
		WebElement Baby = driver.findElement(By.xpath("//span[text() = 'Baby & Kids']"));
		String Text5 = Baby.getText();
		System.out.println(Text5);
		
		WebElement Home = driver.findElement(By.xpath("//span[text() = 'Home & Furniture']"));
		String Text6 = Home.getText();
		System.out.println(Text6);
		
		
		WebElement Sports = driver.findElement(By.xpath("//span[text() = 'Sports, Books & More']"));
		String Text7 = Sports.getText();
		System.out.println(Text7);
		
		WebElement offer = driver.findElement(By.xpath("//span[text() = 'Offer Zone']"));
		String Text8 = offer.getText();
		System.out.println(Text8);

	}

}



