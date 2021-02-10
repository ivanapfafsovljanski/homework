package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.CartPage;
import pages.MainPage;
import pages.MyAccountPage;
import pages.ShopPage;

public class BaseTest {
	WebDriver driver;
	MyAccountPage myAccountPage;
	MainPage mainPage;
	//ExcelCitac citacIzExela;
	ExcellCitac citacIzEksela;
	ShopPage shopPage;
	CartPage cartPage;
	
	@BeforeClass
	public void preKlase() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		this.myAccountPage = new MyAccountPage(driver);
		this.mainPage = new MainPage(driver);
		//citacIzEksela = new ExcellCitac("data/test plan.xlsx");
		this.citacIzEksela = new ExcellCitac("data/testPlan.xlsx");
		this.shopPage = new ShopPage(driver);
		this.cartPage = new CartPage(driver);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void pposleKlase() throws IOException {
		//driver.close();
		System.out.println("Izvrsava se posle klase");
		citacIzEksela.fis.close();
	}
}
