package katalonTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LogingTest extends KatalonBeginnigClass{
	
	@BeforeMethod
	public void beforeMethod() {
		driver.navigate().to("http://cms.demo.katalon.com/");
	}
	@Test (priority = 1)
	public void LogInTest() throws InterruptedException {
		pagePage.clickOnMyAccountTab();
		pageMyAccaount.validUsernameLogIN();
		pageMyAccaount.validPasswordLogin();
		pageMyAccaount.clickOnLogInBtb();
		Assert.assertTrue(pagePage.assertingLogIn());
	}

}
