package org.first;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthexeButtons {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/buttons");
		
		Point ele =  driver.findElementById("position").getLocation();
		System.out.println( "X value" +ele.getX());
		System.out.println( "Y value" +ele.getY());
		
		WebElement eel = driver.findElementById("color");
		System.out.println(eel.getCssValue("background-color"));
		
		WebElement dear = driver.findElementById("property");
		System.out.println(dear.getRect().height);
		System.out.println(dear.getRect().width);
		
		 boolean ff = driver.findElementById("isDisabled").isEnabled();
		 System.out.println(ff);
		
	

}
}