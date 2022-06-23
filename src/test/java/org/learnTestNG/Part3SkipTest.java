package org.learnTestNG;

import org.testng.annotations.Test;

public class Part3SkipTest {

	@Test(priority = 1)
	public void startACar() {
		System.out.println("To start a car");
	}

	@Test(priority = 2)
	public void putKey() {
		System.out.println("First put the key");
	}

	@Test(priority = 7, enabled = false)
	public void satrtMusic() {
		System.out.println("Then start the music");
	}

	@Test(priority = 3)
	public void startBtn() {
		System.out.println("Then start the button");
	}

	@Test(priority = 4)
	public void firstGear() {
		System.out.println("Put first Gear");
	}

	@Test(priority = 5)
	public void secondGear() {
		System.out.println("Put second Gear");
	}

	@Test(priority = 6)
	public void drive() {
		System.out.println("Then start to drive");
	}

}
