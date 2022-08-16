package GroupsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@BeforeClass (alwaysRun = true)
	public void openBrowser() {
		System.out.println("Browser is opened");
	}
	
	@AfterClass (alwaysRun = true)
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	@Test(groups = "Smoke")
	public void Test7() {
		System.out.println("This is Test7");
	}

	@Test (groups = "Functional")
	public void Test8() {
		System.out.println("This is Test8");
	}
	
	
	@Test (groups = {"Functional","Regression"})
	public void Test9() {
		System.out.println("This is Test9");
	}
	
}
