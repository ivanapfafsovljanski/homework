package domaci1;

public class Racun {

	/*Napisati klasu Racun koja ima 2 polja.
Prvo polje 'brRacuna' tipa String predstavlja broj racuna.
brRacuna moze da se dohvati, ali ne i postavi
Drugo polje 'stanje' tipa double i predstavlja stanje na racunu
Stanje ima pocetnu vrednost 0 i moze da se dohvati
Napisati metode za dodavanje i uzimanje
novca za drugo polje.

dohvati=get
postavi=set*/
	
	//u Klasi se defini�e polje brojRacuna i stanjeNaRacunu (koje se za svaki ra�un postavlja na 0)
	//oba polja su postavljena na private, kako vrednosti ne bi mogle biti menjanje iz druge klase
	private String brojRacuna;
	private double stanjeNaRacunu = 0;

	//konstruktor - za svaki novi objekat pravi polje brojRacuna. stanjeNaRacunu je u Klasi postavljeno na 0
	//pomo�u konstruktora svakom novom objektu dodeljujemo broj ra�una, i kasnije ne mo�emo da ga menjamao
	public Racun(String racun) {
		this.brojRacuna = racun;
	}

	//metoda za vra�anje broja ra�una - u ispisu
	public String getBrojRacuna() {
		return this.brojRacuna;
	}
	
	//metoda za postavljanje nove vrednosti za stanje na ra�unu
	public void setStanje(double stanje) {
		this.stanjeNaRacunu = stanje;
	}
	
	//metoda za vra�anje vrednosti koju ima property stanjeNaRa�unu
	public double getStanje() {
		return this.stanjeNaRacunu;
	}
}
