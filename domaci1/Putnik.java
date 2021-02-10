package domaci1;

import java.util.Scanner;

public class Putnik extends Covek{
/*Putnik je covek koji poseduje novac. 
Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
Odredjena svota novca moze da mu se doda i/ili oduzme.*/
	
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
	
	public void stanjeNovca(double svota) {
		Scanner sken = new Scanner(System.in);
		String vrstaPromene;
		System.out.println("da li dodajete ili oduzimate novac");
		vrstaPromene = sken.next();
		if ((svota > novac) && (vrstaPromene.equalsIgnoreCase("oduzmi"))) {
			System.out.println("Nemate dovoljno novca");
		}
		else {
			
		
		if (vrstaPromene.equalsIgnoreCase("dodaj")) {
			novac = novac + svota;
		}
		else if (vrstaPromene.equalsIgnoreCase("oduzmi")) {
			novac = novac - svota;
		}
		else
			System.out.println("Niste pravilno uneli vrstu transakcije");
		System.out.println("Nakon transakcija imate " + novac + " dinara");
	}
	}
	
}
