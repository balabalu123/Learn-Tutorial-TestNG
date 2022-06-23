package org.dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Jxl {
	
	
	Object [][] data=null;
	
	WebDriver driver;
		
		@DataProvider(name="login Data")
		private Object[][] dataProvider() throws BiffException, IOException {
			data=excelSheet();
			return data;

		}
		
		
		private Object[][] excelSheet() throws BiffException, IOException {
			
			FileInputStream f = new FileInputStream("D:\\DataProvider-TestNG-Datadriven,jxl and plain java1.xls");

			Workbook book = Workbook.getWorkbook(f);
			
			Sheet sheet = book.getSheet(0);
			
			int rowsCount = sheet.getRows();
			int columnsCount = sheet.getColumns();
			
			Object[][]testData= new Object[rowsCount-1][columnsCount];
			
			for (int i = 1; i < rowsCount; i++) {
				
				for (int j = 0; j < columnsCount; j++) {
					
					 testData[i-1][j] = sheet.getCell(j,i).getContents();
					
					
				}
				
				
				
			}
			
			return testData;
		}
		
		
		
		
		
		
		
		
		@Test(dataProvider="login Data")
		private void BothCorrect(String uName, String pWord) {
			
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
			WebElement txtUser = driver.findElement(By.id("txtUsername"));
			txtUser.sendKeys(uName);
			WebElement txtPass = driver.findElement(By.id("txtPassword"));
			txtPass.sendKeys(pWord);
			WebElement loginBtn = driver.findElement(By.id("btnLogin"));
			loginBtn.click();

		}

		@BeforeTest
		private void launch() {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		}
	

		@AfterTest
		private void quitBrowser() {
			driver.quit();

		}
}
