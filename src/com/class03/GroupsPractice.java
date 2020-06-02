package com.class03;

import org.testng.annotations.Test;

public class GroupsPractice {
	@Test(groups="Regression")
	public void test1() {
		System.out.println("This is first test");
	}
	@Test(groups="Smoke")
	public void test2() {
		System.out.println("This is second test");
	}
	@Test(groups= {"Regression","Smoke"})
	public void test3() {
		System.out.println("This is third test");
	}
	@Test
	public void test4() {
		System.out.println("This is fourth test");
	}
	@Test(groups= {"Smoke"})
	public void test5() {
		System.out.println("This is fifth test");
	}

}
