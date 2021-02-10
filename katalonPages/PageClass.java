package katalonPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageClass {
	WebDriver driver;
	WebElement pageCartTab;
	WebElement pageMyAccountTab;
	WebElement pageShopTab;
	List<WebElement> listOfTabs;

	public PageClass(WebDriver driver) {
		this.driver = driver;
	}
	public void setListOfTabe() {
		listOfTabs = driver.findElements(By.className("page_item"));
	}
	
	public void listOfPageTab() {
		setListOfTabe();
		pageCartTab = listOfTabs.get(0);
		pageMyAccountTab = listOfTabs.get(2);
		pageShopTab = listOfTabs.get(4);
	}
	public void clickOnCartTab() {
		listOfPageTab();
		pageCartTab.click();	
	}
	public void clickOnMyAccountTab() {
		listOfPageTab();
		pageMyAccountTab.click();
	}
	
	public void clickOnShopTab() {
		listOfPageTab();
		pageShopTab.click();
	}
	
	public boolean assertingLogIn() {
		//if logout button is present
		return driver.findElement(By.className("woocommerce-MyAccount-navigation-link--customer-logout")).isDisplayed();
		
		
	}
	
	
	

}
