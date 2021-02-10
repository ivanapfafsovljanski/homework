package newPagesNinja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import newTestsNinja.ExcelReader;

public class NewMyAccountPage {

	WebDriver driver;
	WebElement inputField;
	WebElement passwordField;
	WebElement loginBtn;
	ExcelReader readfromExcell;
	
	public NewMyAccountPage(WebDriver driver, ExcelReader readfromExcell) {
		this.driver = driver;	
		this.readfromExcell = readfromExcell;
	}
	

	public WebElement getInputField() {
		return inputField = driver.findElement(By.id("username"));
	}


	public WebElement getPasswordField() {
		return passwordField = driver.findElement(By.id("password"));
	}


	public void loginMethod() {
		String username = readfromExcell.usernameValue("CorectCredentials", 1, 2);
		String password = String.valueOf(readfromExcell.passwordValue("CorectCredentials", 2, 2));
	
		getInputField().sendKeys(username);
		getPasswordField().sendKeys(password);
		loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}
	public void clearFields() {
		getInputField().clear();
		getPasswordField().clear();
	}
	public String greetingMesage() {
		return driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/p[1]/strong[1]")).getText();
	}
	public void logOut() {
		driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/nav/ul/li[6]/a")).click();
	}
}

