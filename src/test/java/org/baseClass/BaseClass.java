package org.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 return driver;

	}
	public void geturl(String url) {
		driver.get(url);
	}
	
	public void sendKeys(WebElement element,String data) {
		element.sendKeys(data);
		
	}	
		
	public void btnclick(WebElement element) {
		element.click();
		

	}	
		
		
		
		
		
		
		
		
	

}
