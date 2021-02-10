package domaci1;

public class Klub {
//sadrži do 11 igraèa i do 4 trenera
	
	private Igrac[] igrac;
	private Trener[] trener;
	
	int brojIgraca = 0;
	int brojTrenera = 0;
	public Klub() {
		Igrac[] igrac = new Igrac[brojIgraca];
		Trener[] trener = new Trener[brojTrenera];
	}
	
	
	public void dodajIgraca(Igrac igrac) {
		if (brojIgraca <= 11 && brojIgraca >=0) {
			for (int i = 0; i < brojIgraca; i++) {
				this.igrac[i] = igrac;
			}
		}
	}
	public void dodajTrenera(Trener trener) {
		if (brojTrenera <=5 && brojTrenera >=0) {
			for (int i = 0; i < brojTrenera; i++) {
				this.trener[i] = trener;
			}
		}
	}
	
}
