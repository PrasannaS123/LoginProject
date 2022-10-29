package org.first;

import org.openqa.selenium.chrome.ChromeDriver;

public class FifthexeXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	//attribute X path	driver.findElementByXPath("//input[@placeholder='Email address or phone number']").sendKeys("prasannajayanth3101@gmail.com");
		
	// Conditional X path	driver.findElementsByXPath("//input[@type='text'][@name='email']");
		
	// fuctions => last(),position()	driver.findElementsByXPath("//input[contains(@placeholder,'Email address ')]");
		
	// text()	driver.findElementByXPath("//a[text()='Forgotten password?']").click();
		
	// text()	driver.findElementsByXPath("//button[text()='Log In']");
		
	// child-->ancestor 	driver.findElementByXPath("//input[@id='pass']/ancestor::div[@class='clearfix _5466 _44mg']");
		
	}

}
