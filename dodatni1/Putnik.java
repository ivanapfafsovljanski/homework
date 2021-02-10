package dodatni1;

import java.util.Scanner;

public class Putnik extends Covek{
	/*Putnik je covek koji poseduje novac. 
	Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
	Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.*/
	
	private double novac;

	public Putnik(String ime, String prezime, double novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public double getNovac() {
		return novac;
	}

	public void setNovac(double novac) {
		this.novac = novac;
	}
	
	public boolean transakcija(double suma, String vrstaTransakcije) {
		
		if ((suma > novac) && (vrstaTransakcije.equalsIgnoreCase("oduzmi"))) {
			System.out.println("Nemate dovoljno novca za transakciju");
			return false;
		}
		else {
			if (vrstaTransakcije.equalsIgnoreCase("oduzmi")) {
				novac -= suma;
				return true;
				
			}
			else if (vrstaTransakcije.equalsIgnoreCase("dodaj")) {
				novac += suma;
				return true;
			}
			else {
				System.out.println("niste dobro uneli vrstu transakcije");
				return false;
			}
		}
	}
	public void potvrdaTransakcije(double suma, String vrstaTransakcije) {
		
		if (transakcija(suma, vrstaTransakcije)) {
			System.out.println("Transakcija je uspešno obavljana");
		}
		else
			System.out.println("Transakcija nije obavljana");
	}
}
