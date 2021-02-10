package domaci25122020;

import java.util.Scanner;

public class Domaci3 {

	public static void main(String[] args) {
		/*
		 * Napisati program gde korisnik unese broj, a program mu vrati odgovor da li je
		 * unet broj prost ili ne
		 */

		Scanner sken = new Scanner(System.in);
		int broj;
		System.out.println("Uneseite broj");
		broj = sken.nextInt();

		if (prostBroj(broj)[prostBroj(broj).length-1]) {
			System.out.println("Broj je prost");
		}
		else
			System.out.println("Broj nije prost");
	}

	public static boolean[] prostBroj(int broj) {
		boolean[] nizBrojeva = new boolean[broj + 1];
		for (int i = 0; i <= broj; i++) {
			nizBrojeva[i] = true;
		}
		for (int j = 2; j <= broj; j++) {
			if (nizBrojeva[j]) {

				for (int i = j * 2; i < nizBrojeva.length; i += j) {
					nizBrojeva[i] = false;
				}
			}
		}
		return nizBrojeva;
	}
}
