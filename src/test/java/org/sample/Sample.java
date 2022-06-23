package org.sample;

import org.baseClass.BaseClass;
import org.pageObjectModel.AmazonPojo;
import org.pageObjectModel.LoginFb;

public class Sample extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		BaseClass b = new BaseClass();
		b.launchBrowser();
		b.geturl("https://www.amazon.in/");
		AmazonPojo a = new AmazonPojo();
		a.mobilesClick();
		
		
		
		
	}

}
