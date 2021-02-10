package domaci19januar;

public class Racun29122020 {
	/*Napisati klasu Racun koja ima 2 polja.
	Prvo polje 'brRacuna' tipa String predstavlja broj racuna.
	brRacuna moze da se dohvati, ali ne i postavi
	Drugo polje 'stanje' tipa double i predstavlja stanje na racunu
	Stanje ima pocetnu vrednost 0 i moze da se dohvati
	Napisati metode za dodavanje i uzimanje
	novca za drugo polje.

	dohvati=get
	postavi=set*/
		
		
		private String brojRacuna;
		private double stanjeNaRacunu = 0;


		public Racun29122020(String brojRacuna) {
			super();
			this.brojRacuna = brojRacuna;
			
		}

		//metoda za vraæanje broja raèuna - u ispisu
		public String getBrojRacuna() {
			return this.brojRacuna;
		}
		
		
		public void setStanje(double stanje) {
			this.stanjeNaRacunu = stanje;
		}
		
		
		public double getStanje() {
			return this.stanjeNaRacunu;
		}
}
