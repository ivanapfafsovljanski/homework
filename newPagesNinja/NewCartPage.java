package newPagesNinja;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class NewCartPage {
	WebDriver driver;
	WebElement inCart1;
	WebElement inCart2;
	WebElement inCart3;
	
	List<WebElement> productsInCart;
	

	public NewCartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setListOfProductsInCart() {
		productsInCart = driver.findElements(By.cssSelector(".woocommerce-cart-form__cart-item.cart_item"));
	}
	public ArrayList<String> itemsInCartName() {
		setListOfProductsInCart();
		inCart1 = productsInCart.get(0).findElement(By.className("product-name"));
		String inCart1Text = inCart1.getText();
		inCart2 = productsInCart.get(1).findElement(By.className("product-name"));
		String inCart2Text = inCart2.getText();
		inCart3 = productsInCart.get(2).findElement(By.className("product-name"));
		String inCart3Text = inCart3.getText();
		ArrayList<String> nameOfItemsInCart = new ArrayList<String>();
		nameOfItemsInCart.add(inCart1Text);
		nameOfItemsInCart.add(inCart2Text);
		nameOfItemsInCart.add(inCart3Text);
		return nameOfItemsInCart;
	}
	public ArrayList<String> itemsInCartPrice() {
		setListOfProductsInCart();
		inCart1 = productsInCart.get(0).findElement(By.className("woocommerce-Price-amount"));
		String inCart1Price = inCart1.getText();
		inCart2 = productsInCart.get(1).findElement(By.className("woocommerce-Price-amount"));
		String inCart2Price = inCart2.getText();
		inCart3 = productsInCart.get(2).findElement(By.className("woocommerce-Price-amount"));
		String inCart3Price = inCart3.getText();
		ArrayList<String> priceOfItemsInCart = new ArrayList<String>();
		priceOfItemsInCart.add(inCart1Price);
		priceOfItemsInCart.add(inCart2Price);
		priceOfItemsInCart.add(inCart3Price);
		return priceOfItemsInCart;
	}
	public void detetingOneItemFromCart() {
		setListOfProductsInCart();
		inCart2 = productsInCart.get(1).findElement(By.className("remove"));
		inCart2.click();
		//System.out.println();
	}
	//probati i "getAttribute("value"))"
	public boolean isPresentUndeletetItem() {
		setListOfProductsInCart();
		inCart1 = productsInCart.get(0);
		return inCart1.isDisplayed();
	}
	
	

}
