package Basics;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodAnotationsPractice {
	
	
	@BeforeMethod
	public void login() {
		System.out.println("Logged in to the application");
		
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logged out from the application");
	}
	
	@Test (priority =2)
	public void HomePageTest() {
		System.out.println("Validated Home Page");
		Reporter.log("Validated Home Page");
	}
	
	@Test (priority =3)
	public void ProfilePageTest() {
		System.out.println("Validated Profile Page");
	}
	
	@Test (priority =1)
	public void NotificationPageTest() {
		System.out.println("Validated Notification Page");
	}

}
