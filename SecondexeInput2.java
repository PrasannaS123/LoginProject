package org.first;

import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;

public class SecondexeInput2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/edit");
		
		driver.findElementById("fullName").sendKeys("Prasanna");
		
		driver.findElementById("join").sendKeys(" tester",Keys.ENTER);
		
		String value = driver.findElementById("getMe").getAttribute("value");
		System.out.println(value);
		
		driver.findElementById("clearMe").clear();
		
		boolean yuo = driver.findElementById("noEdit").isEnabled();
		System.out.println(yuo);
		
		
		String you = driver.findElementById("dontwrite").getAttribute("value");
		System.out.println(you);
		
		driver.quit();
		

	}

}
