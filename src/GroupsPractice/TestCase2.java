package GroupsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@BeforeClass (alwaysRun = true)
	public void openBrowser() {
		System.out.println("Browser is opened");
	}
	
	@AfterClass (alwaysRun = true)
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}

	@Test(groups = "Smoke")
	public void Test4() {
		System.out.println("This is Test4");
	}

	@Test (groups = "Functional")
	public void Test5() {
		System.out.println("This is Test5");
	}
	
	
	@Test (groups = {"Functional","Regression"})
	public void Test6() {
		System.out.println("This is Test6");
	}
}
