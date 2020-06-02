package com.class02;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

//1.Open chrome browser
//2.Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//3.Login into the application
//4.Click on Add Employee
//5.Verify labels: Full Name, Employee Id, Photograph are displayed
//6.Provide Employee First and Last Name
//7.Add a picture to the profile
//8.Verify Employee has been added successfully
//9.Close the browser
public class HRMS extends CommonMethods {
//	@BeforeMethod
//	public void openBrowser() {
//		setUp();
//	}
//
//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}

	@Test
	public void login() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		boolean isDisplayed = login.logo.isDisplayed();
		// System.out.println(isDisplayed);
		Assert.assertTrue(isDisplayed);
	}

	@Test
	public void addingEmployee() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);

		click(dashboard.PIM);
		click(dashboard.addEmp);

		addEmp.firstName.sendKeys("James");
		addEmp.lastName.sendKeys("Bond");
		click(addEmp.saveBtn);

		wait(5);
		boolean actualEmpID = pdetails.empFirstName.isDisplayed();
		System.out.println(actualEmpID);
		Assert.assertTrue(actualEmpID);
	}

}
