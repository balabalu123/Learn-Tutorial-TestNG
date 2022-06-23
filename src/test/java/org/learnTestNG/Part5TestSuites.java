package org.learnTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part5TestSuites {
WebDriver driver;	
long startingTime;
long endingTime ;
	//Open the chrome browser then
	//open google,bing,yahoo
	

    @BeforeSuite
	public void launchBrowser() {
    	startingTime = System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		  
		 

	}
	@Test
	public void Tc001() {

		
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		
		
		
	}

	@Test
	public void Tc002() {

		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		
	}
	

	@Test
	public void Tc003() {

		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.manage().window().maximize();
		
		
	}
	
	@AfterSuite
	public void quitBrowser() {
		
		driver.close();
		 endingTime = System.currentTimeMillis();
		long totaltime = endingTime-startingTime;
		System.out.println("Total time taken is:"+totaltime);
	}
	
	
	
	
	
	

}
