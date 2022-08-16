package AssertionsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertPractice {
	
	String str1 = "hi";  // actual 
	String str2 = "Hi";  // expected
	
//	@Test
//	public void test1() {
//		Assert.assertEquals(str1, str2);
//		// if actual and expected results matched then only test case will pass.
//	}

//	@Test
//	public void test2() {
//		Assert.assertNotEquals(str1, str2);
//		// if actual and expected results are not matched then only test case will pass.
//	}
	
//	@Test
//	public void test3() {
//		Assert.assertNull(str1); // fail
//		// if actual and expected results matched then only test case will pass.
//	    // if both the comparing parameters are empty then this test case will pass.
//	}
	
	
//	@Test
//	public void test3() {
//		Assert.assertNotNull(str1);
//		// if actual and expected results not matched then only test case will pass.
//	    // if both the comparing parameters are not empty then this test case will pass.
//	    // This will  pass the testcase if validating input is not null means contains some information.
//	}
	
	@Test
	public void test4() {
		Assert.fail();
	}
	
}
	

