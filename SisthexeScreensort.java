package org.first;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SisthexeScreensort {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File next = new File("./images/imgg.png");
		FileHandler.copy(screenshotAs, next);
		
		File screenshotAs2 = driver.findElementByName("login").getScreenshotAs(OutputType.FILE);
		File worst = new File("./images/pic.png");
		FileHandler.copy(screenshotAs2, worst);
		
		
		
		driver.quit();
		
		
		

	}

}
