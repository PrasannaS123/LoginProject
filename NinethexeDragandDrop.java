package org.first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class NinethexeDragandDrop {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Frame = driver.findElementByXPath("//iframe[@class='demo-frame lazyloaded']");
		driver.switchTo().frame(Frame);
		
		WebElement source = driver.findElementByXPath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][1]");
		WebElement target = driver.findElementById("trash");
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, target).perform();
		
		WebElement source1 = driver.findElementByXPath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][2]");
		WebElement target1 = driver.findElementById("trash");
		
		Actions builder1 = new Actions(driver);
		builder1.dragAndDrop(source1, target1).perform();
		
		driver.quit();
		
		
		
		


}
}
