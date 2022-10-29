package org.first;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstexeBasic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://letcode.in/signin");
	
	driver.findElementByName("email").sendKeys("prasannajayanth3107@gmail.com");
	
	driver.findElementByName("password").sendKeys("jaya@001");
	
	driver.findElementByXPath("//button[.='LOGIN']").click();
	
	driver.quit();
}
}