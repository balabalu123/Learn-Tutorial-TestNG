package org.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMPageFactoryUpdated {
	
	
	@FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a")
	public static WebElement myProfile;
	
	@FindBy(name="phone")
	public static WebElement mobileNo;
	
	@FindBy(name="city")
	public static WebElement city;
	
	@FindBy(xpath="//button[text()='Update Profile']")
	public static WebElement updateProfile;
	
	
	
	

}
