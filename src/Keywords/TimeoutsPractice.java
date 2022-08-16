package Keywords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeoutsPractice {

	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Browser is launched.");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Browser is closed.");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Logged in to the application successfully");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logged out from the application");
	}
	
	@Test (timeOut = 5000)
	public void homepageTest() throws InterruptedException {
		Thread.sleep(6000);
		System.out.println("Testing the unstable functionality on homepage");
	}
	
	@Test (invocationCount = 2)
	public void notificationpageTest() {
		System.out.println("Testing the notification page");
	}

}
