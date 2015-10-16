package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNg_Annotations {

	@BeforeSuite // once before executing all tests in all java files (batch)
	public void initialiseSelenium(){
		System.out.println("Initialise selenium");
	}

	@AfterSuite // once after executing all tests in all java files (batch)
	public void shotdownSelenium(){
		System.out.println("shotdown selenium");	
	}

	@BeforeTest // before executing all tests cases
	public void openConnection() {
		System.out.println("Connecting to db");
	}

	@AfterTest // after executing all tests cases
	public void closeConnection() {
		System.out.println("Closing connection");
	}

	@BeforeMethod // before executing every test
	public void openBrowser() {
		System.out.println("Openning browser");
	}

	@AfterMethod // after executing every test
	public void clseBrowser() {
		System.out.println("Closing browser");
	}

	@Test // test case 
	public void testRecieveMail() {
		System.out.println("Testing recieving mail");
	}

	@Test // test case 
	public void testSendMail() {
		System.out.println("Testing sending mail");
	}


}
