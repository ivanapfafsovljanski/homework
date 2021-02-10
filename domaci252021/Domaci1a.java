package domaci252021;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci1a {

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
				Thread.sleep(5000);
				
				//Klik na rezultat pretrage - full xpath - ne prolazi samo sa xpath
				driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/ytd-thumbnail/a/yt-img-shadow/img")).click();
				
				
				//JavascriptExecutor js = (JavascriptExecutor) driver;	
				//dugme za preskakanje reklame - neæe, pa neæe!
		
				//WebElement skipDugme = driver.findElement(By.xpath("//*[@id=\"preskip-component:3\"]/span"));
				//js.executeScript("arguments[0].click()",skipDugme);
				//puštanje pesme iz liste sa desne strane
				Thread.sleep(15000);
				WebElement sledecaPesma = driver.findElement(By.xpath("//*[@id=\"items\"]/ytd-compact-autoplay-renderer"));
				sledecaPesma.click();
				
	}

}
