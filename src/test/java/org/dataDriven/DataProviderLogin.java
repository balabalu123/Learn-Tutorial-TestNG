package org.dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderLogin {
	// Data driven framework using Data provider

	String [][] data={
		{"Admin","admin123"},
		{"Admin","admin2848"},
		{"adddmin","admin123"},
		{"admeen","aadmin1234"}
		
		
		
		
		
		
	};
	
	@DataProvider(name="login Data")
	private String[][] dataProvider() {
		return data;

	}
	
	
	@Test(dataProvider="login Data")
	private void BothCorrect(String uName, String pWord) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		WebElement txtUser = driver.findElement(By.id("txtUsername"));
		txtUser.sendKeys(uName);
		WebElement txtPass = driver.findElement(By.id("txtPassword"));
		txtPass.sendKeys(pWord);
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();

	}


}
