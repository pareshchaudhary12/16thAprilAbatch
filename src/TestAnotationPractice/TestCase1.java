package TestAnotationPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test
	public void m1() {
		System.out.println("This is method m1");
	}
	
	@Test
	public void m2() {
		System.out.println("This is method m2");
	}
	
	@Test
	public void m3() {
		System.out.println("This is method m3");
	}

}
