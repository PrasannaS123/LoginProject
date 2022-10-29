package org.first;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirteenexeWebTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		WebElement tables = driver.findElementByXPath("//table[@id='countries']");
		List<WebElement> headers = tables.findElements(By.tagName("h3"));
		for (WebElement head : headers) {
			String text = head.getText();
			System.out.println(text);
			
	}
		List<WebElement> rows = tables.findElements(By.cssSelector("tbody tr"));
		
			
		
		int size = rows.size();
		System.out.println(size);
		if (size==197) {
			System.out.println("perfect");
	}else {
		System.out.println("ImPerfert");
	}
	
			
			
		}
		
		
		
		
		
				

}

