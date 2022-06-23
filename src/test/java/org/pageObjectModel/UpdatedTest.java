package org.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdatedTest {
	
	@Test
	private void login() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver, POMPageFactoryLogin.class);

		
		POMPageFactoryLogin.userName.sendKeys("user@phptravels.com");
		POMPageFactoryLogin.passWord.sendKeys("demouser");
		POMPageFactoryLogin.gotIt.click();
	    POMPageFactoryLogin.loginBtn.click();
		
		PageFactory.initElements(driver, POMPageFactoryUpdated.class);

		POMPageFactoryUpdated.myProfile.click();
		
		POMPageFactoryUpdated.mobileNo.sendKeys("9710634562");
		POMPageFactoryUpdated.city.sendKeys("chennai");
		
		Thread.sleep(3000);
		WebElement scrollDown = driver.findElement(By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"));
		JavascriptExecutor exe =(JavascriptExecutor)driver;
		exe.executeAsyncScript("arguments[0].scrollIntoView(true)", scrollDown);
		
		Thread.sleep(3000);
		POMPageFactoryUpdated.updateProfile.click();
		
		
		
		
		
		
		
	}
}
