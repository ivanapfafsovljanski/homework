package domaci2112021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci2112021 {

	public static void main(String[] args) throws InterruptedException {
		/*Ocitava stranicu https://demoqa.com/ (inace stranica je namenjena za automatsko testiranje i 
		 * odlicna je za pocetak pa mozete ako zelite proci kroz sve delove stranice)
Klikne na "Elements"
Klikne na "Text Box"
Polje "Full name" ocisti pa unese vase ime - ciscenje se radi tako sto napisete ime elementa kako ste ga nazvali i 
dodate .clear() na primer za element username bi bilo username.clear();
U polje "Email" unesite vas email
Kliknete na "Check Box"
Kliknete na strelicu da se spusti dropdown lista (levo od "Home" dugme)
Selektujete samo "Desktop"
Kliknete ponovo na "Elements" da se zatvori spisak
Na kraju stavite sleep 5 sekundi i zatvorite program*/
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//otvaranje stranice https://demoqa.com/
		driver.navigate().to("https://demoqa.com/");
		//Klik na "Elements" - celo velikopolje je klikabilno i svi elementi na njemu
		WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
		element.click();
		//klik na "text Box"
		driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
		//èišæenje polja Full Name
		WebElement punoIme = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		punoIme.clear();
		WebElement mail = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
		//u zadatku ne piše da treba isprazniti polje, pa je sledeæi red zakomentarisan
		//mail.clear();
		mail.sendKeys("ivana.pfafsovljanski@gmail.com");
		
		//klik na check box
		driver.findElement(By.xpath("//*[@id=\"item-1\"]")).click();
		//klik na strelicu za otvaranje drop-down liste - mora da se selektuje button u HTML-u
		
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
		//selektovanje foldera Desktop - može da se selektuje klikom na "check box" ili na ikonicu folder
		//treba da se odabrati labela za sva 3 elementa u HTML-u
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label")).click();
		
		//klik na dugme element (nije isto kao dugme element na poèetku programa)
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div")).click();
		
		Thread.sleep(5000);
		driver.close();

	}

}
