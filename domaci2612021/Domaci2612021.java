package domaci2612021;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Domaci2612021 {
	/*Koristeci anotacije testNG-a, napisati test sa sledecim zahtevima:


Otici na web stranicu http://www.seleniumframework.com/Practiceform/
Assert-ovati sva polja iz "contact us" forme
Popuniti sva polja iz "contact us" forme i submit-ovati formu

Podrazumeva se da se test izvrsava po istom redosledu kao i sto su definisani zahtevi u zadatku


Dodatni deo za vezbu: Assert-ovati sva ostala polja/dugmice sa ove stranice - ovo je za vikend*/
	
	WebDriver driver;
	WebElement nameF;
	WebElement emailF;
	WebElement phonF;
	WebElement countryF;
	WebElement companyF;
	WebElement mesageF;
	public void init() {
		 nameF = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[1]/input"));
		 emailF = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[2]/input"));
		 phonF = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[3]/input"));
		 countryF = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[4]/input"));
		 companyF = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[5]/input"));
		 mesageF = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/span/textarea"));
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver.navigate().to("http://www.seleniumframework.com/Practiceform/");
		Thread.sleep(2000);
	}
	
	@Test (priority = 0)
	public void nameField() {	
		init();
		Assert.assertTrue(nameF.isDisplayed());	
	}
	@Test (priority = 2)
	public void emailField() {	
		init();
		Assert.assertTrue(emailF.isDisplayed());
	}

	@Test (priority = 4)
	public void phoneF() {
		init();
		Assert.assertTrue(phonF.isDisplayed());
	}
	
	@Test (priority = 6)
	public void countryField() {
		init();
		Assert.assertTrue(countryF.isDisplayed());
	}
	
	@Test (priority = 8)
	public void companyField() {
		init();
		Assert.assertTrue(companyF.isDisplayed());
	}
	
	@Test (priority = 10)
	public void mesageField() {
		init();
		Assert.assertTrue(mesageF.isDisplayed());
	}
	
	@Test (priority = 12)
	public void contacUSForm() throws InterruptedException{
		init();
		nameF.sendKeys("Ivana");
		emailF.sendKeys("test@test.com");
		phonF.sendKeys("555-12345");
		countryF.sendKeys("Tasmania");
		companyF.sendKeys("BugsBunny Ltd.");
		mesageF.sendKeys("What's up dock?!");
		WebElement submitBtn = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/p/a[1]"));
		submitBtn.click();
		Thread.sleep(2000);
		WebElement potvrda = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div[1]/div"));
		Assert.assertTrue(potvrda.isDisplayed());
	}
	
	@AfterMethod
	public void afterMethod()  {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();

	}
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
