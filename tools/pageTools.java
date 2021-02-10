package tools;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageTools {

	WebDriver driver;
	WebElement booksAppTab;
	List<WebElement> listaTabova;
	JavascriptExecutor js;
	
	
	public pageTools(WebDriver driver, JavascriptExecutor js) {
		this.driver = driver;
		this.js = js;
	}

	public void setListTabs() {
		
		listaTabova = driver.findElements(By.className("card-body"));
	}
	
	public WebElement getBooksAppTab() {	
		int booksAppLocation = (listaTabova.size()-1);
		WebElement booksBtnToClick = listaTabova.get(booksAppLocation);
		return booksBtnToClick;
	}

	public void clickOnBooksAppTab() {
		setListTabs();
		getBooksAppTab().click();
	}
	public void pageScrol() {
	setListTabs();
	js.executeScript("arguments[0].scrollIntoView();", getBooksAppTab());
	}
}
