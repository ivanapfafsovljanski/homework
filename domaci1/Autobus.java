package domaci1;

import java.util.ArrayList;

public class Autobus {
/*Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze. 
Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca.*/
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

	public Vozac getVozac() {
		return vozac;
	}

	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}

	public ArrayList<Putnik> getPutnik() {
		return putnik;
	}

	public void setPutnik(ArrayList<Putnik> putnik) {
		this.putnik = putnik;
	}
	
	public double cenaPrevoza(int brojKarata) {
		double placanje;
		if (prisutanVozac()) {
			 placanje = cenaKarte * brojKarata;
			
			return placanje;
		}
		else {
			placanje = 0;
				return placanje;
		}
		
	}
	public boolean prisutanVozac() {
		if (this.vozac == null) {
			return false;
		}
		else
			return true;
	}
}
