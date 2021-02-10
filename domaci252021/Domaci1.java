package domaci252021;

import java.awt.Window;
import java.nio.channels.ClosedByInterruptException;
import java.util.ArrayList;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci1 {

	public static void main(String[] args) throws InterruptedException {
		/*Automatizovati youtube kroz sledece zahteve:
1) otici na sajt youtube
2) u search-u pronaci Rick Astley i pustiti pesmu Never gonna give you up
// voditi racuna da ako postoje reklame da ih preskocite
Dodatni zadatak
Nakon sto je pustena pesma, iz liste sa desne strane (watch next) pustiti drugi predlozen video*/
		
		System.setProperty("webdriver.chrome.driver",
					"driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
		
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Rick Astly" + Keys.ENTER);
		Thread.sleep(2000);
		
		
		
		//full xpath - ne prolazi samo sa xpath
		driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/ytd-thumbnail/a/yt-img-shadow/img")).click();
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		//dugme za preskakanje reklame
		
		//js path
		//document.querySelector("#ad-text\\:3")
		
		//*[@id="skip-button:6"]/span/button
		//js.executeScript("arguments[0].click()", driver.findElements(By.xpath("//*[@id=\"skip-button:6\"]/span/button")));
		//js.executeScript("arguments[0].click()", driver.findElements(By.className("ytp-ad-text ytp-ad-preview-text")));
		driver.findElements(By.className("ytp-ad-text ytp-ad-preview-text"));
		ArrayList<WebElement> rucke =  new ArrayList<WebElement>(driver.findElements(By.className("ytp-ad-text ytp-ad-preview-text")));
		
		//driver.findElements(By.xpath("//*[@id=\"preskip-component:3\"]/span"));
				
		//WebElement skipDugme = driver.findElement(By.xpath("//*[@id=\"preskip-component:3\"]/span"));
		//if (skipDugme.isDisplayed()) {
			//js.executeScript("document.getElementById('preskip-component:3')';")
			//js.executeScript("arguments[0].setAttribute('style','visibility:visible;')",skipDugme);									
			//js.executeAsyncScript(arg0, arg1)
			/*while (skipDugme.isDisplayed()) {
				Thread.sleep(1000);
				skipDugme.click();
			}
		}*/
	
		
		/*WebElement sledecaPesma = driver.findElement(By.xpath("//*[@id=\"secondary-inner\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[1].click()",sledecaPesma);*/
	}

}
