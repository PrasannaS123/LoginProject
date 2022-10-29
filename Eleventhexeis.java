package org.first;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eleventhexeis {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/edit");
		
		List<WebElement> labels = driver.findElementsByXPath("//label[@class='label']");
		for (WebElement ele : labels) {
			String text = ele.getText();
			System.out.println(text);
			
		}
		int size = labels.size();
		System.out.println(size);
		
		WebElement remove = labels.remove(3);
		System.out.println(remove.getText());
		
		for (WebElement ele1 : labels) {
			String text = ele1.getText();
			System.out.println(text);
			
		}
		driver.quit();
		
		
	
		
		
		
		
		

	}

}
