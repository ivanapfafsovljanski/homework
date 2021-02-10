package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTests extends BaseTest {
	
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("http://cms.demo.katalon.com/");
		Thread.sleep(2000);
		
	}
	
	@Test (priority = 1)
	public void logIn() throws InterruptedException {
		
		String username = citacIzEksela.getStingData("CorectCredentials", 2, 2);
		String pass = String.valueOf(citacIzEksela.getIntData("CorectCredentials", 3, 2));
		System.out.println(pass);
		
		mainPage.navigateToMyAccount();
		Thread.sleep(2000);
		//myAccountPage.logIn("customer","123456789");
		
		myAccountPage.insertUsername(username);
		Thread.sleep(5000);
		myAccountPage.insertPassword(pass);
		Thread.sleep(2000);
		myAccountPage.logInButtonClick();
		Thread.sleep(2000);
		String poruka = citacIzEksela.getLogOutData("CorectCredentials", 4, 2);
		String textForAssert = myAccountPage.getLogOutLabel().getText();
		Assert.assertEquals(textForAssert, "Log out");
		}
	/*//@Test (priority = 2)
	public void logInEmptyString() throws InterruptedException {
		mainPage.navigateToMyAccount();
		Thread.sleep(2000);
		//myAccountPage.logIn("customer","123456789");
		myAccountPage.insertUsername("");
		Thread.sleep(2000);
		myAccountPage.insertPassword("");
		Thread.sleep(2000);
		myAccountPage.logInButtonClick();
		Thread.sleep(2000);
		
		String textForAssert = myAccountPage.getLogOutLabel().getText();
		Assert.assertEquals(textForAssert, "Log out");
	
	}
	//@Test (priority = 4)
	public void logInWrongCredential() {
		mainPage.navigateToMyAccount();
		myAccountPage.insertUsername("neki user");
		myAccountPage.insertPassword("lozinka");
		myAccountPage.logInButtonClick();
		String textForAssert = myAccountPage.getLogOutLabel().getText();
		Assert.assertEquals(textForAssert, "Log out");
	}
	
	//@Test (priority = 6)
	public void logInAndOut() throws InterruptedException {
		mainPage.navigateToMyAccount();
		myAccountPage.insertUsername("customer");
		myAccountPage.insertPassword("123456789");
		myAccountPage.logInButtonClick();
		
		myAccountPage.logOutButtonClick();
		Thread.sleep(2000);
		
		//Cookie cookieLogedIn = driver.manage().getCookieNamed("wordpress_logged_in_4d8a854e0c8bd1c7f0585d2f4b3ad575");
		//boolean isPresent = cookieLogedOut.equals(null);
		//Assert.assertNull(cookieLogedIn);
	}*/
	@Test (priority = 8)
	public void putItemInCart() {
		mainPage.navigateToShopPage();
		shopPage.getItem();
		
	}
	/*@Test (priority = 10)
	public void deletingItem() {
		
	}*/
	@Test (priority = 12)
	public void adding3Items() {
		shopPage.shopPageItemClick();
		shopPage.getISecondttem();
		shopPage.getIThirdttem();
	}
	
	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	
}
