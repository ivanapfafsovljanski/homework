package domaci1;

public class RacunMain {

	public static void main(String[] args) {
		
		//za objekat racun01 preko konstruktora unosimo vrednost za property brojRacuna 
		Racun racun01 = new Racun("01-30-12-2020");
		
		//vra�amo vrednosti za brojRacuna i stanjeNaRacunu (i vrednost stanjeNaRacunu stavljamo u promenljivu stanje
		racun01.getBrojRacuna();
		double stanje = racun01.getStanje();
		
		//prvo �tampanje broja ra�una i stanja
		System.out.println("Na ra�unu broj " + racun01.getBrojRacuna() + " " + " stanje je " + stanje);
		
		//promena stanja na ra�unu, vra�anje nove vrednosti stanja na ra�unu i �tampanje
		racun01.setStanje(20000);
		stanje = racun01.getStanje();
		System.out.println("Na ra�unu broj " + racun01.getBrojRacuna() + " " + " stanje je " + stanje);

	}

}
