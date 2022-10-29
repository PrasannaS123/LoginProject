package org.first;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EighthexeAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		WebElement Frame = driver.findElementByXPath("//iframe[@name='iframeResult']");
		driver.switchTo().frame(Frame);
		driver.findElementByXPath("//button[.='Try it']").click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		String text = driver.findElementById("demo").getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.switchTo().defaultContent();
		driver.findElementByXPath("//a[@id='getwebsitebtn']").click();
		driver.manage().window().maximize();
		
		driver.quit();

		
		

				
		
		


		
		
		
		
		
		
		
		
		
	
}
}
