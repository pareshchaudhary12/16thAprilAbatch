package Keywords;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodPractice {

	@Test (priority = 1)
	public void openurl() {
		System.out.println("url is opened");
	}
	
	@Test (priority = 2,dependsOnMethods = "openurl")
	public void login() {
		System.out.println("Logged in to the application");
	}

	
	@Test (priority = 3 , dependsOnMethods = {"openurl","login"})
	public void logout() {
		System.out.println("Logged out from the application");
	}
	
	
}
