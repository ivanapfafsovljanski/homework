package domaci25122020;

import java.util.Scanner;



public class Domaci3Drugacije {

	public static void main(String[] args) {
		/*Napisati program gde korisnik unese broj, a program mu vrati odgovor da li je
		 * unet broj prost ili ne*/
		
		Scanner sken = new Scanner(System.in);
		int broj;
		boolean jesteProst;
		System.out.println("Unesite broj od -2.147.483.648 do 2.147.483.647");
		broj = sken.nextInt();
		
		jesteProst = prostBroj(broj);
		if (broj == 0) {
			System.out.println("Nula ima specijalne osobine - nije broj");
			jesteProst = false;
		}
		if (jesteProst) {
			System.out.println("Broj je prost");
		}
		else
			System.out.println("Broj nije prost");
		
	}
		public static boolean prostBroj(int broj) {
			
			int brojac = 2;
			boolean prost = true;
			if (broj < 0) {
				broj = broj * (-1);
			}
			
			for (int i = 2; i < broj-1; i++) {
				
				if (broj % i == 0) {
					brojac++;
					if (brojac > 2) {
						prost = false;
						break;
					}
				}
			}
		return prost;

	}

}
