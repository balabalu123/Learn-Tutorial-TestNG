package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	@Test
	private void login() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");

		PageFactory.initElements(driver, POMPageFactoryLogin.class);

		POMPageFactoryLogin.userName.sendKeys("user@phptravels.com");
		POMPageFactoryLogin.passWord.sendKeys("demouser");
		POMPageFactoryLogin.gotIt.click();
        POMPageFactoryLogin.loginBtn.click();

	}

}
