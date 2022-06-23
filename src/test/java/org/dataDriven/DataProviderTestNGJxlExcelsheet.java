package org.dataDriven;

import java.io.FileInputStream;

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

public class DataProviderTestNGJxlExcelsheet {
	
	Object [][] data=null;
		
	WebDriver driver;
			
		
		@DataProvider(name="login Data")
		private Object[][] dataProvider() throws BiffException, IOException {
			
			data=getExcelData();
			return data;

		}
		
		private Object[][] getExcelData() throws BiffException, IOException {
			
			FileInputStream excel = new FileInputStream("D:\\DataProvider-TestNG-Datadriven,jxl and plain java1.xls");
			Workbook w = Workbook.getWorkbook(excel);
			Sheet sheet = w.getSheet(2);
			
			int rowsCount = sheet.getRows();
			int columnsCount = sheet.getColumns();
			
			Object testData [][]= new Object [rowsCount-1][columnsCount];//To mentioned the size of values  5-1=4x2
			for (int i = 1; i < rowsCount; i++) {
				
				for (int j = 0; j < columnsCount; j++) {
					
					 testData[i-1][j]= sheet.getCell(j,i).getContents();
					
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
		private void closeBrowser() {
			driver.quit();

		}
	
	
}
