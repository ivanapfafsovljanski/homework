package domaci21122020;

import java.util.Scanner;

public class Dodatni2 {

	public static void main(String[] args) {
		/*
		 * Korisnik ucitava niz od n elemenata niza, kao i neki broj br. Program
		 * ispisuje elemente niza deljive brojem br.
		 */

		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite broj èlanaova niza");
		int brojClanova = sken.nextInt();
		int[] nizBrojeva = new int[brojClanova];
		int pomocniNiz[] = new int[brojClanova];
		int pomocnaSuma = 0;
		int delilac;

		System.out.println("unesite prirodan broj");
		delilac = sken.nextInt();
		if (delilac == 0) {
			System.out.println("Nula nije prirodan broj");

		} else {

			for (int i = 0; i < brojClanova; i++) {
				System.out.println("Unesite " + (i + 1) + ". èlan niza");
				nizBrojeva[i] = sken.nextInt();
			}

			System.out.println("Èlanovi unetog niza deljivi sa " + delilac + " su:");
			for (int i = 0; i < nizBrojeva.length; i++) {

				if (nizBrojeva[i] % delilac == 0) {
					System.out.println(nizBrojeva[i]);
					pomocniNiz[i] = nizBrojeva[i];
				}

			}
			for (int j = 0; j < pomocniNiz.length; j++) {
				
				pomocnaSuma += pomocniNiz[j];
			}
			if (pomocnaSuma == 0) {
				System.out.println("U nizu nema èlanova koji su deljivi sa " + delilac);
			}
		}
		System.out.println("Kraj programa");

	}
}
