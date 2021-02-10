package katalonTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import katalonPages.PageClass;
import katalonPages.PageMyAcount;

public class KatalonBeginnigClass {
	WebDriver driver;
	PageClass pagePage;
	PageMyAcount pageMyAccaount;
	
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");	
		this.driver = new ChromeDriver();
		this.pagePage = new PageClass(driver);
		this.pageMyAccaount = new PageMyAcount(driver);
		
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}
}
