package org.learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Part10Assert {
	
	
	String name = "Balu";
	boolean value = false;
	
	@Test
	private void checkEquals() {
	Assert.assertEquals(name, "Balu");

	}
	@Test
	private void assertTrue() {
	Assert.assertFalse(value, "This should not be true");

	}


	
}
