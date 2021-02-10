package domaci2;

public class Automobili {
/*Napisati klasu Automobil. Automobil ima
marku (polje tipa String) koje moze da se dohvati, ali ne i postavi
model (polje tipa String) koje moze da se dohvati ali ne i postavi
serijski broj (polje tipa int) koje moze da se dohvati ali ne i postavi
Automobil moze da ima vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku

Napisati glavni program koji kreira dva automobila.
U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.*/
	
	private String marka;
	private String model;
	private int serijskiBroj;
	public String vlasnik; //stavila sam da je public zbog zahteva u zadatku da se u svakom trenutku može postaviti i 
							//dohvatiti vrednost. 
	
	public String getMarka() {
		return this.marka;
	}
	public String getModel () {
		return this.model;
	}
	public int getSerijskiBroj () {
		return this.serijskiBroj;
	}
	public String getVlasnik () {
		return this.vlasnik;
	}
	public void setVlasnik (String vlasnik) {
		this.vlasnik = vlasnik;
	}
	
	/* -Shvatila sam sad da su setJosNesto i getJosNesto samo metode u okviru klase i set.. može da postavlja više vrednosti
	 * ,a get pošto vraæa vrednost, koristi se samo za jedno polje :))
	 * U zadatku se nije tražila ali sam probala da li radi
	public void setOAutu(String marka, String model, int serijskiBroj, String vlasnik) {
		this.marka = marka;
		this.model = model;
		this.serijskiBroj = serijskiBroj;
		this.vlasnik = vlasnik;
	}*/
	//konstruktor
	public Automobili (String marka, String model, int serijskiBroj, String vlasnik) {
		this.marka = marka;
		this.model = model;
		this.serijskiBroj = serijskiBroj;
		this.vlasnik = vlasnik;		
	}
	public void ispisPodataka() {
		System.out.println("Automobil marke " + this.marka + " i modela " + this.model + ", serijskog broja " + this.serijskiBroj +
				" je u vlasništvu " + this.vlasnik);
	}
	
}
