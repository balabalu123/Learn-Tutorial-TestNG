package org.dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenPlainJavaExcelsheet {

	static List<String> userNameList = new ArrayList<String>();
	static List<String> passWordList = new ArrayList<String>();
	WebDriver driver;

	private void readExcel() throws IOException {

		FileInputStream f = new FileInputStream("D:\\PlainJavaExcelDataDriven.xlsx");

		Workbook w = new XSSFWorkbook(f);

		Sheet sheet = w.getSheetAt(0);

		Iterator<Row> rowIterator = sheet.rowIterator();

		while (rowIterator.hasNext()) {

			Row rowValue = rowIterator.next();

			Iterator<Cell> columnIterator = rowValue.iterator();

			int i = 2;
			while (columnIterator.hasNext()) {

				if (i % 2 == 0) {

					userNameList.add(columnIterator.next().getStringCellValue());

				} else {

					passWordList.add(columnIterator.next().getStringCellValue());
				}
				i++;

			}
			

		}

	}

	private void login(String uName,String pWord) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		WebElement txtUser = driver.findElement(By.id("txtUsername"));
		txtUser.sendKeys(uName);
		WebElement txtPass = driver.findElement(By.id("txtPassword"));
		txtPass.sendKeys(pWord);
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();
		driver.quit();

	}



	private void executeTest() {
		for (int i = 0; i < userNameList.size(); i++) {
			
			login(userNameList.get(i),passWordList.get(i));

		}

	}

	public static void main(String[] args) throws IOException {
		DataDrivenPlainJavaExcelsheet dpj = new DataDrivenPlainJavaExcelsheet();
		dpj.readExcel();
		System.out.println("UserNames" + userNameList);
		System.out.println("PassWords" + passWordList);
		dpj.executeTest();

	}

}
