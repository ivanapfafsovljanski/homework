package newPagesNinja;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class NewShopPage {
	WebDriver driver;
	
	WebElement item1Add;
	WebElement item2Add;
	WebElement item3Add;
	List<WebElement> listOfProductsByLi;
	List<WebElement> listOfProducts;
	
	public NewShopPage(WebDriver driver) {
		this.driver = driver;
		
	}
	//ubacuje više od 1 item in Cart???
	/*public void setListOfProducts() {
		listOfProducts = driver.findElements(By.className("add_to_cart_button"));
	}
	
	public void adding3ItemsZoCard() throws InterruptedException {
		setListOfProducts();
		Thread.sleep(500);
		listOfProducts.get(0).click();
		Thread.sleep(500);
		listOfProducts.get(1).click();
		Thread.sleep(500);
		listOfProducts.get(2).click();
	}*/
	/*public void Item1Check() {
		item1Add = driver.findElement(By.xpath("[contains (text(), ‘fliying-ninja/’)]"));
		System.out.println(item1Add);
	}*/
	
	public void setListOfProductByLi() {
		listOfProductsByLi = driver.findElements(By.cssSelector(".product.type-product"));
	}
	public void adding3ItemsToCard() {
		setListOfProductByLi();
		item1Add = listOfProductsByLi.get(0).findElement(By.className("add_to_cart_button"));
		item2Add = listOfProductsByLi.get(1).findElement(By.className("add_to_cart_button"));
		item3Add = listOfProductsByLi.get(2).findElement(By.className("add_to_cart_button"));
		
	}
	public void clickOn3Items() throws InterruptedException {
		adding3ItemsToCard();
		item1Add.click();
		item2Add.click();
		item3Add.click();
	}
	public void add2ItemsInCart() {
		adding3ItemsToCard();
		item2Add.click();
		item3Add.click();
	}
	
	/*
	public WebElement getItem1AddBtn() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[2]"));
	}

	public WebElement getItem2AddBtn() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[3]/div/a[2]"));
	}

	public WebElement getItem3AddBtn() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[7]/div/a[2]"));
	}

	

	public WebElement getFlyngNinjaAddToCardButton() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[2]"));
	}
	public String item1Text() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/a/h2")).getText();
	}
	public String item3Text() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/a/h2")).getText();
	}
	public String item7Text() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/a/h2")).getText();
	}
	*/
}
