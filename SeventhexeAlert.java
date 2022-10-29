package org.first;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeventhexeAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/alert");
		
		driver.findElementById("accept").click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		driver.findElementById("confirm").click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.accept();
		
		driver.findElementById("prompt").click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Prasanna");
		alert3.accept();
		
		driver.quit();

		
		

	
		

	}

}
