package domaci_2212021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci1 {

	public static void main(String[] args) throws InterruptedException {
		/*Napisite program gde korisnik: Ide ponovo na sajt https://demoqa.com/ , 
		 * ide na Elements, 
		 * ide na Buttons,
		 *  klikne dugme "Click me" i u programu stampa koju poruku je dobio ispod dugmeta. 
		 *  Nakon toga obrisati sve cookies i zatvoriti program.
		 */

		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/");
		
		//klik na "elements"
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]")).click();
		//klik na "Buttons"
		driver.findElement(By.xpath("//*[@id=\"item-4\"]")).click();
		//Thread.sleep(2000);
		//klik na "click me" - za dynamic Web Element koristiti full xpath - navode se i drugi naèini, ali nisu proradili
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[3]/button")).click();
		
		String poruka = driver.findElement(By.xpath("//*[@id=\"dynamicClickMessage\"]")).getText();
		System.out.println(poruka);
		
		
		driver.manage().deleteAllCookies();
		
		
		driver.close();
		
		
		
		
		
	}

}
