package org.pageObjectModel;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass {
	
	public AmazonPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(xpath="//a[@class='nav-a  ']"),@FindBy(xpath="//a[@class='nav-a  ']")})
	private WebElement Mobiles;
	
	
	
	public WebElement getMobiles() {
		return Mobiles;
	}
	
	public void mobilesClick() {
		btnclick(getMobiles());
	}
	

}
