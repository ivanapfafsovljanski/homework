package newTestsNinja;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import newPagesNinja.NewCartPage;
import newPagesNinja.NewMainPage;
import newPagesNinja.NewMyAccountPage;
import newPagesNinja.NewShopPage;


public class BeginningClass {

	WebDriver driver;
	NewMainPage mainPage;
	NewMyAccountPage pageMyAccount;
	NewShopPage pageShop;
	NewCartPage pageCart;
	ExcelReader readerFromExcell;
	ExcellWriter writeInexcell;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");	
	this.driver = new ChromeDriver();
	readerFromExcell = new ExcelReader("data/newData.xlsx");
	this.pageMyAccount = new NewMyAccountPage(driver, readerFromExcell);
	this.pageCart = new NewCartPage(driver);
	this.pageShop = new NewShopPage(driver);
	this.mainPage = new NewMainPage(driver);
	
	driver.manage().window().maximize();
			
	}
	
	@AfterClass
	public void afterClass() throws IOException {
		driver.close();
		readerFromExcell.fis.close();
	}
}
