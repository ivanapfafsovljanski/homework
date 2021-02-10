package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pages.MainPage;
import pages.MyAccountPage;

public class LogInTests1 {
	WebDriver driver;
	MyAccountPage myAccountPage;
	MainPage mainPage;
	ExcellCitac citacIzExela;
	
	@BeforeClass
	public void preKlase() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		this.myAccountPage = new MyAccountPage(driver);
		this.mainPage = new MainPage(driver);
		citacIzExela = new ExcellCitac("data/test plan.xlsx");
		driver.manage().window().maximize();
	}
	
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("http://cms.demo.katalon.com/");
		Thread.sleep(2000);
	}
	
	@Test (priority = 0)
	public void logIn() throws InterruptedException {
		//String username = citacIzExela.getIntData("CorectCredentials", 2, 2);
		String password = String.valueOf(citacIzExela.getIntData("LogIn", 6, 2));
		//String logOutText = citacIzExela.getStringData("LogIn", 9, 2);
		
		mainPage.navigateToMyAccount();
		Thread.sleep(2000);
		
		//myAccountPage.logIn("customer","123456789");
		//myAccountPage.insertUsername(username);
		Thread.sleep(2000);
		myAccountPage.insertPassword(password);
		Thread.sleep(2000);
		myAccountPage.logInButtonClick();
		Thread.sleep(2000);
		
		String textForAssert = myAccountPage.getLogOutLabel().getText();
		//Assert.assertEquals(textForAssert, logOutText);
		}
	
	//@Test (priority = 5)
	public void logInWithoutCredentials() throws InterruptedException {
		mainPage.navigateToMyAccount();
		Thread.sleep(2000);
		//myAccountPage.logIn("customer","123456789");
		myAccountPage.insertUsername("");
		Thread.sleep(2000);
		myAccountPage.insertPassword("");
		Thread.sleep(2000);
		myAccountPage.logInButtonClick();
		Thread.sleep(2000);
		
		//String textForAssert = myAccountPage.getNoCredentialsLabel().getText();
		//Assert.assertEquals(textForAssert, "Error: Username is required.");
		}
	
	//@Test (priority = 10)
	public void logInWrongCredentials() throws InterruptedException {
		mainPage.navigateToMyAccount();
		Thread.sleep(2000);
		//myAccountPage.logIn("customer","123456789");
		myAccountPage.insertUsername("customer1");
		Thread.sleep(2000);
		myAccountPage.insertPassword("asdasdasd");
		Thread.sleep(2000);
		myAccountPage.logInButtonClick();
		Thread.sleep(2000);
		
		//String textForAssert = myAccountPage.getWrongCredentialsLabel().getText();
	//	Assert.assertEquals(textForAssert, "ERROR: Invalid username. Lost your password?");
		}
	
	//@Test (priority = 15)
	public void logOut() throws InterruptedException {
		logIn();
		myAccountPage.getLogOutLabel().click();
		
		String textForAssert = myAccountPage.getLogInButton().getText();
		Assert.assertEquals(textForAssert, "LOG IN");
		}
	
	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void pposleKlase() {
		driver.close();
		System.out.println("Izvrsava se posle klase");
	}
	
}
