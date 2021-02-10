package domaci1;

public class RacunMain {

	public static void main(String[] args) {
		
		//za objekat racun01 preko konstruktora unosimo vrednost za property brojRacuna 
		Racun racun01 = new Racun("01-30-12-2020");
		
		//vraæamo vrednosti za brojRacuna i stanjeNaRacunu (i vrednost stanjeNaRacunu stavljamo u promenljivu stanje
		racun01.getBrojRacuna();
		double stanje = racun01.getStanje();
		
		//prvo štampanje broja raèuna i stanja
		System.out.println("Na raèunu broj " + racun01.getBrojRacuna() + " " + " stanje je " + stanje);
		
		//promena stanja na raèunu, vraæanje nove vrednosti stanja na raèunu i štampanje
		racun01.setStanje(20000);
		stanje = racun01.getStanje();
		System.out.println("Na raèunu broj " + racun01.getBrojRacuna() + " " + " stanje je " + stanje);

	}

}
