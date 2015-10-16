package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg_Assertions {

	@Test
	public void deleteEmail() {
		System.out.println("Deleting Email before assertion");

		// Example 1
		// Expected text / Actual text
		Assert.assertEquals("Good", "Good");

		// Example 2
		// test will continue despite the failure
		System.out.println("before assertion error");
		try {
			// Condition / Error message description
			Assert.assertTrue(6>8, "My Error Message - assertTrue");	// assertion fails but test will continue
		} catch (Throwable t) {
			System.out.println("Catch and report error"); // report the error into reports 
		}
		System.out.println("after assertion error");

		// Example 3
		// Condition / Error message description
		Assert.assertFalse(6<1, "My Error Message - assertFalse");

		System.out.println("Deleting Email after assertion"); 
	}
}
