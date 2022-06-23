package org.learnTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Part8Parameterization {
	
	@Test
	@Parameters("Name")
	private void Names(String name) {
	System.out.println("My name is"+name);
	}

}
