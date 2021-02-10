package domaci25122020;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		/*Napisati program gde korisnik unese ime, prezime i pol, 
		 * a program mu vrati "Dobrodosao u IT + (ime i prezime)" ili 
		 * "Dobrodosla u IT + (ime i prezime)" zavisno koji pol unese
		 */
		String imeIPrezime;
		String pol;
		Scanner sken = new Scanner(System.in);
		System.out.println("Molim Vas unesite svoje ime i prezime");
		imeIPrezime = sken.next();
		System.out.println("Unesite svoj pol");
		pol = sken.next();
		if (pol.equalsIgnoreCase("muški")) {
			System.out.println("Dobrodošao u IT " + imeIPrezime);
		}
		else if (pol.equalsIgnoreCase("ženski")) {
			System.out.println("Dobrodošla u IT " + imeIPrezime);
		}
		else {
			System.out.println("Proverite da li ste dobro uneli pol: muški / ženski");
		}

	}

}
