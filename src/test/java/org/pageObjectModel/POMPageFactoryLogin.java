package org.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMPageFactoryLogin {
	
	
	@FindBy(name="email")
	public static WebElement userName;
	
	@FindBy(name="password")
	public static WebElement passWord;
	
	@FindBy(id="cookie_stop")
	public static WebElement gotIt;
	
	
	
	@FindBy(xpath="//*[@id=\'fadein\']/div[1]/div/div[2]/div[2]/div/form/div[3]/button/span[1]")
	public static WebElement loginBtn;
	
	
	
	
	

}
