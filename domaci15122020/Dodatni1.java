package domaci15122020;

import java.util.Scanner;

public class Dodatni1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		 * potrosace sadrzi sledece opcije:
		 * 
		 * 0 - Izlaz iz programa 1 - dodavanje cene proizvoda na racun (ubacivanje u
		 * potrosacku korpu) 2 - naplata racuna
		 * 
		 * Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese
		 * opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje
		 * na racun u prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika
		 * da unese kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost
		 * manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja
		 * racuna i da se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili
		 * jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
		 * Zatim se ponovo ispisuje meni.
		 */

		int unetBroj;
		float racun = 0f;
		float cena;
		String izbor;
		float uplacenNovac;
		float kusur;
		
		
		do {
		System.out.println("Molim Vas da unesete odgovarajuæu cifru za željenu akciju");
		System.out.println("Za izlaz iz programa unesite 0");
		System.out.println("Za dodavanje cene proizvoda na raèun unesite 1");
		System.out.println("Za naplatu raèuna unesite 2");
		System.out.println("Unesite cifru");

		Scanner sken = new Scanner(System.in);
		unetBroj = sken.nextInt();

		switch (unetBroj) {
		case 0: {
			
			System.out.println("Kraj programa");
			break;
		}
		case 1: {

			do {
				System.out.println("Molim Vas da unesete cenu vašeg proizvoda");
				cena = sken.nextFloat();
				racun = racun + cena;
				System.out.println("vaš raèun iznosi " + racun);
				System.out.println("Da li imate još proizvoda");
				System.out.println("za DA unesite da");
				System.out.println("za NE unseite ne");

				izbor = sken.next();
				
			} while (izbor.equalsIgnoreCase("da"));
			//klasièno poreðenje sa == ne prolazi jer, kako sam shvatila, porede se 2 objekta
			//i String i Scanner su objekti pa se porede njihove instance (adrese u memoriji) a ne same vrednosti
			break;
		}
		case 2: {
			
			System.out.println("Milim Vas unesite koliko novca uplaæujete");
			uplacenNovac = sken.nextFloat();
			
			if (uplacenNovac < racun) {
				System.out.println("GREŠKA! Uneli ste iznos koji je manji od Vašeg raèuna");
			}
			else {
				kusur = uplacenNovac - racun;
				System.out.println("Vaš kusur je " + kusur);
				racun = 0;
			}
			break;
		}
		default:{
			System.out.println("Unesite jednu od cifara 0, 1 ili 2");
		}
		}
		} while (unetBroj != 0);
		
		}

		

	}


