package tests;

import org.testng.annotations.Test;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;

// Second set of tests
public class Second_TestNg {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before checking Email");
		throw new SkipException("Skipping test description"); // Skip test
	}

	@Test
	public void checkEmail() {
		System.out.println("Checking Email");
	}


}



