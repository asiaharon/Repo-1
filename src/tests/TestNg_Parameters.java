package tests;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestNg_Parameters  {

	@Test(dataProvider = "testData") // test registerData will use the data provider TestData
	public void registerData(String username, String password,
			String email, String city) {
		System.out.println(username + " -- " + password + " -- " + email + " -- " + city);
	}

	@DataProvider
	public Object[][] testData() {
		// rows - number of times test has to be repeated
		// col - parameters in data  
		Object[][] data = new Object[3][4];

		// first row
		data[0][0] = "user1";
		data[0][1] = "password1";
		data[0][2] = "email1";
		data[0][3] = "city1";

		// second row
		data[1][0] = "user2";
		data[1][1] = "password2";
		data[1][2] = "email2";
		data[1][3] = "city2";

		// third row
		data[2][0] = "user3";
		data[2][1] = "password3";
		data[2][2] = "email3";
		data[2][3] = "city3";
		
		return data;
	}
}
