package org.first;

import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdexeNavigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/buttons");
		driver.findElementById("home").click();
		
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		driver.findElementById("home").click();
		
		
		driver.navigate().to("https://letcode.in/signin");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
