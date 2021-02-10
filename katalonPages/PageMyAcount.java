package katalonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class PageMyAcount {
	WebDriver driver;
	WebElement usernameField;
	WebElement passwordField;
	WebElement logInBtn;
	
	public PageMyAcount(WebDriver driver) {
		this.driver = driver;
	}
	

	public WebElement getUsernameField() {
		return usernameField = driver.findElement(By.id("username"));
	}

	public WebElement getPasswordField() {
		return passwordField = driver.findElement(By.id("password"));
	}
	public WebElement getLogInBtn() {
		return logInBtn = driver.findElement(By.name("login"));
	}

	public void validUsernameLogIN() {	
		 getUsernameField().clear();
		 getUsernameField().sendKeys("customer");
	}
	public void validPasswordLogin() throws InterruptedException {
		getPasswordField().clear();
		Thread.sleep(1000);
		getPasswordField().sendKeys("123456789");
	}
	public void clickOnLogInBtb() {
		getLogInBtn().click();
	}
	

}
