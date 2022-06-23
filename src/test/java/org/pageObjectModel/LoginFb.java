package org.pageObjectModel;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginFb extends BaseClass{
	
	public LoginFb() {
		PageFactory.initElements(driver, this);
	}
	
    @FindBys({@FindBy(id="email") ,@FindBy(xpath="//input[@type='text']")})
	private WebElement textUser;
	
	@FindAll({@FindBy(xpath="//a[@class='nav-a  ']"),@FindBy(xpath="//a[@class='nav-a  ']")})
	private WebElement textPass;
	
	@CacheLookup
	@FindBy(name="login")
	private WebElement loginBtn;

	public WebElement getTextUser() {
		return textUser;
	}

	public WebElement getTextPass() {
		return textPass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void textUser(String data) {
		sendKeys(getTextUser(), data);

	}

	public void textPass(String data) {
		sendKeys(getTextPass(), data);

	}
	public void loginBtn() {
		btnclick(getLoginBtn());

	}
	
	

}
