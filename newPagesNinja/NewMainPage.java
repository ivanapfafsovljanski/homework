package newPagesNinja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewMainPage {

	WebDriver driver;
	WebElement pageShopTab;
	WebElement pageCartTab;
	WebElement pageMyAccountTab;
	
	
	public NewMainPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPageShopTab() {
		return pageShopTab = driver.findElement(By.className("page-item-7"));
	}

	public WebElement getPageCartTab() {
		return pageCartTab = driver.findElement(By.className("page-item-8"));
	}

	public WebElement getPageMyAccountTab() {
		return pageMyAccountTab = driver.findElement(By.className("page-item-10"));
	}
	
	public void shopTabClick() {
		getPageShopTab().click();
	}
	public void myAccountTabClick() {
		getPageMyAccountTab().click();
	}
	public void cardTabClick()  {
		getPageCartTab().click();
	}
}
