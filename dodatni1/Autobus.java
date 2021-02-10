package dodatni1;

import java.util.ArrayList;

public class Autobus {
/*Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze.
 Naziv i cena karte i zadaju se prilikom kreiranja. */
	
	private String naziv;
	private Vozac vozac;
	private double cenaKarte;
	private ArrayList<Putnik> putnik;
	
	public Autobus(String naziv, Vozac vozac, double cenaKarte, ArrayList<Putnik> putnik) {
		super();
		this.naziv = naziv;
		this.vozac = vozac;
		this.cenaKarte = cenaKarte;
		this.putnik = putnik;
	}
	
}
