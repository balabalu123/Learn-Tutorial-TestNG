package org.learnTestNG;

import org.testng.annotations.Test;

import io.cucumber.cucumberexpressions.Group;

public class Part7TestGroup {
	
	@Test(groups= {"Apple"})
	private void Apple1() {
		System.out.println("Apple Testing");

	}
	@Test(groups= {"Apple"})
	private void Apple2() {
		System.out.println("Apple Testing");

	}
	@Test(groups= {"vivo"})
	private void Vivo1() {
		System.out.println("vivo Testing");

	}
	@Test(groups= {"vivo"})
	private void Vivo2() {
		System.out.println("vivo Testing");

	}
	@Test(groups= {"Lenovo"})
	private void Lenovo1() {
		System.out.println("Lenovo Testing");

	}
	@Test(groups= {"Lenovo"})
	private void Lenovo2() {
		System.out.println("Lenovo Testing");

	}
	@Test(groups= {"Moto"})
	private void Moto1() {
		System.out.println("Moto Testing");

	}
	@Test(groups= {"Moto"})
	private void Moto2() {
		System.out.println("Moto Testing");

	}
	
	
	

}
