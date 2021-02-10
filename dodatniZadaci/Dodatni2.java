package dodatniZadaci;

import java.util.Scanner;

public class Dodatni2 {

	public static void main(String[] args) {
//		Napisati program koji ucitava N brojeva
//		od korisnika i proverava da li se u
//		unetim brojevima nalazi broj K
//		(K takodje unosi korisnik)
		//ja sam dodala: koliko se puta K pojavljuje
		
		Scanner sken = new Scanner(System.in);
		int kolikoUnositeBrojeva;
		int brojKojiProveravamo;
		int unetiBroj;
		int brojac = 0;
		
		System.out.println("Unesite koliko brojeva proveravamo");
		kolikoUnositeBrojeva = sken.nextInt();
		System.out.println("Unesite koji broj tražimo");
		brojKojiProveravamo = sken.nextInt();
		
		for (int i = 0; i < kolikoUnositeBrojeva; i++) {
			System.out.println("Unesite " + (i+1) + ". broj");
			unetiBroj = sken.nextInt();
			if (unetiBroj == brojKojiProveravamo) {
				brojac++;
			}
		}
		if (brojac != 0) {
			System.out.println("Broj " + brojKojiProveravamo + " se meðu unetim brojevima pojavljuje " + brojac + " puta");
		}
		else {
			System.out.println("Broj " + brojKojiProveravamo + " se meðu unetim brojevima NE pojavljuje");
		}
		
		
				

	}

}
