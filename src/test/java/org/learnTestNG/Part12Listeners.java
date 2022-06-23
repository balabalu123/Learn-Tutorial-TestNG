package org.learnTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Part12Listeners implements ITestListener {

	public void onFinish(ITestContext arg0) {
		System.out.println("This is going to finish");
		
	}

	public void onStart(ITestContext arg0) {
		System.out.println("This is going to start");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("This is getting failed with sucess percentage");
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("This is going to test failure");
		
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("This test is going to skipped");
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("This is going to start");
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("This is goig to success");
		
	}

}
