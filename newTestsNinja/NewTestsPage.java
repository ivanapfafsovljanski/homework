package newTestsNinja;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestsPage extends BeginningClass{

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		//Thread.sleep(3000);
		driver.navigate().to("http://cms.demo.katalon.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	@Test (priority = 1)
	public void logInGoodCredentials() {
		mainPage.myAccountTabClick();
		pageMyAccount.clearFields();
		pageMyAccount.loginMethod();
		Assert.assertEquals(pageMyAccount.greetingMesage(), readerFromExcell.usernameValue("CorectCredentials", 3, 2));
		pageMyAccount.logOut();
	}
	@Test (priority = 10)
	public void adding3DifferentProducts() throws IOException, InterruptedException {
		mainPage.myAccountTabClick();
		pageMyAccount.clearFields();
		pageMyAccount.loginMethod();
		mainPage.shopTabClick();
		//pageShop.adding3ItemsZoCard();
		//pageShop.adding3ItemsToCard();
		pageShop.clickOn3Items();
		mainPage.cardTabClick();
		//pageShop.Item1Check();
		//TREBA NAPRAVITI LISTU (NEGDE)
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a")).getText(), pageCart.itemsInCartName().get(0));
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[4]/span")).getText(), pageCart.itemsInCartPrice().get(0));
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[2]/td[3]/a")).getText(), pageCart.itemsInCartName().get(1));
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[2]/td[4]/span")).getText(), pageCart.itemsInCartPrice().get(1));
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[3]/td[3]/a")).getText(), pageCart.itemsInCartName().get(2));
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[3]/td[4]/span")).getText(), pageCart.itemsInCartPrice().get(2));
	}
	
	@Test (priority = 15)
	public void adding2ItemsDeleting1() {
		mainPage.myAccountTabClick();
		pageMyAccount.clearFields();
		pageMyAccount.loginMethod();
		mainPage.shopTabClick();
		pageShop.add2ItemsInCart();
		mainPage.cardTabClick();
		pageCart.detetingOneItemFromCart();
		Assert.assertTrue(pageCart.isPresentUndeletetItem());
	}
	
	@AfterMethod
	public void afterMethod () {
		driver.manage().deleteAllCookies();
	}
}
