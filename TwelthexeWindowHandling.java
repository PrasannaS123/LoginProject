package org.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwelthexeWindowHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		
		WebElement Frame = driver.findElementByXPath("//iframe[@id='iframeResult']");
		driver.switchTo().frame(Frame);
		
		WebElement ele1 = driver.findElementByXPath("//a[.='Visit W3Schools.com!']");
		ele1.click();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		List<String> ele = new ArrayList<>(windowHandles);
		driver.switchTo().window(ele.get(1));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(ele.get(0));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(ele.get(1));
		System.out.println(driver.getCurrentUrl());
		
		


		
		
		

		
		
		
		driver.quit();
		
		
	}

}
