package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.scanner.Constant;

import com.pages.AddEmployeePageElements;
import com.pages.DashboardPageElements;
import com.pages.LoginPageElements;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class AddEmployeeTest extends CommonMethods {

//	@BeforeMethod
//	public void openBrowser() {
//		setUp();
//		initialize();
//	}
//
//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}

	@Test
	public void addEmployeePage() {
		
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dashboard.navigateToAddEmployee();
		wait(7);
		
//		sendText(addEmp.empFirstName, ConfigsReader.getProperty("employeeFirstname"));
//		sendText(addEmp.empLastName, ConfigsReader.getProperty("employeeLastname"));
//		sendText(addEmp.addPhoto, ConfigsReader.getProperty("filePath"));
//		waitAndClick(addEmp.saveEmp);
		
		//add assertion to verify that employee has been added successfully
		addEmp.firstName.sendKeys("James");
		addEmp.lastName.sendKeys("Bond");
		click(addEmp.saveBtn);

		wait(5);
		boolean actualEmpID = pdetails.empFirstName.isDisplayed();
		System.out.println(actualEmpID);
		Assert.assertTrue(actualEmpID);
		
		
		
	}

}