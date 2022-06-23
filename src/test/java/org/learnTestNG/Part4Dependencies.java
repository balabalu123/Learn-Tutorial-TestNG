package org.learnTestNG;

import org.testng.annotations.Test;

public class Part4Dependencies {

@Test(enabled=true)
private void Highschool() {
	System.out.println("10 th standard");

}
@Test(dependsOnMethods="Highschool")
private void HigherSecSchool() {
	System.out.println("12th standard");

}@Test(dependsOnMethods="HigherSecSchool")
private void Engineering() {
	System.out.println("College");

}	
	
	
	
	
	
	
	

}
