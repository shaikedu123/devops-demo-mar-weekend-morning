package test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicValidation extends BaseTest{

	@Test
	public void urlValidation() {
		String expectedResult = "https://www.facebook.com/ramesh";
		String actualResult = driver.getCurrentUrl();
		
		//display
		Reporter.log("expected result = " + expectedResult);
		Reporter.log("actual result = " + actualResult);
		
		//comparision
		assertTrue(actualResult.equals(expectedResult), "Mismatch in the url");
		//some code changes
		//cc from b1 branch
		//demo for stash- dev2 cc
	}
}
