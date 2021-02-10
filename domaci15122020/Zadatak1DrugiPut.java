package domaci15122020;

import java.util.Scanner;

public class Zadatak1DrugiPut {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		 * od 0 do n - za resavanje ovog zadatka koristiti samo jednu petlju (ne jednu
		 * vrstu petlje, vec samo jednu petlju).
		 */
		
		int zbir = 0;
		long proizvod = 1;
		int unetBroj;
		int j = 1;
		int i = 0;
		
		//IPAK NE MOŽE OVAKO!!!
		System.out.println("Unesite broj");
		Scanner sken = new Scanner(System.in);
		unetBroj = sken.nextInt();
		
		 do{
			zbir += i;
			i += 2;
			proizvod *= j;
			j +=2;
		} while (i <= unetBroj && j <= unetBroj+1);
		System.out.println("Zbir je " + zbir);
		System.out.println("Proizvod je " + proizvod);
	}

}
