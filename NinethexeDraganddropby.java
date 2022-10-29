package org.first;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NinethexeDraganddropby {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/draggable");
		
		WebElement ele = driver.findElementByXPath("//h3[@id='header']");
		Actions builder = new Actions(driver);
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		builder.dragAndDropBy(ele, x+5, y+7).perform();
}
}
