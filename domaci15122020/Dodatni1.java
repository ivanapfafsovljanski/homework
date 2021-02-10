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
		System.out.println("Molim Vas da unesete odgovaraju�u cifru za �eljenu akciju");
		System.out.println("Za izlaz iz programa unesite 0");
		System.out.println("Za dodavanje cene proizvoda na ra�un unesite 1");
		System.out.println("Za naplatu ra�una unesite 2");
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
				System.out.println("Molim Vas da unesete cenu va�eg proizvoda");
				cena = sken.nextFloat();
				racun = racun + cena;
				System.out.println("va� ra�un iznosi " + racun);
				System.out.println("Da li imate jo� proizvoda");
				System.out.println("za DA unesite da");
				System.out.println("za NE unseite ne");

				izbor = sken.next();
				
			} while (izbor.equalsIgnoreCase("da"));
			//klasi�no pore�enje sa == ne prolazi jer, kako sam shvatila, porede se 2 objekta
			//i String i Scanner su objekti pa se porede njihove instance (adrese u memoriji) a ne same vrednosti
			break;
		}
		case 2: {
			
			System.out.println("Milim Vas unesite koliko novca upla�ujete");
			uplacenNovac = sken.nextFloat();
			
			if (uplacenNovac < racun) {
				System.out.println("GRE�KA! Uneli ste iznos koji je manji od Va�eg ra�una");
			}
			else {
				kusur = uplacenNovac - racun;
				System.out.println("Va� kusur je " + kusur);
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


