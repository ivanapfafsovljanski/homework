package domaci219januar;

public class Automobil29122020 {
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
		private String vlasnik; 
		
	
		public Automobil29122020(String marka, String model, int serijskiBroj, String vlasnik) {
			super();
			this.marka = marka;
			this.model = model;
			this.serijskiBroj = serijskiBroj;
			this.vlasnik = vlasnik;
		}
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
		public void ispisPodataka() {
			System.out.println("Automobil marke " + this.marka + " i modela " + this.model + ", serijskog broja " + this.serijskiBroj +
					" je u vlasništvu " + this.vlasnik);
		}
}
