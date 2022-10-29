package org.first;

import java.awt.Button;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TenthexeDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		
		WebElement ele = driver.findElementByXPath("//select[@id='first']");
		ele.click();
		Select Product = new Select(ele);
		Product.selectByVisibleText("Iphone");
		
		List<WebElement> options = Product.getOptions();
		options.forEach(i -> System.out.println(i.getText()));
		
		
		WebElement ele1 = driver.findElementByXPath("//select[@id='animals']");
		ele1.click();
		Select Animals = new Select(ele1);
		Animals.selectByIndex(1);
		
		WebElement lee = driver.findElementByXPath("//select[@id='second']");
		lee.click();
		Select fooditems = new Select(lee);
		fooditems.selectByIndex(1);
		fooditems.selectByVisibleText("Pizza");
		
		List<WebElement> options2 = fooditems.getAllSelectedOptions();
		options2.forEach(i-> System.out.println(i.getText()));
		
		boolean multiple = fooditems.isMultiple();
		System.out.println(multiple);
		
		driver.quit();
		
		
		
	}

}
