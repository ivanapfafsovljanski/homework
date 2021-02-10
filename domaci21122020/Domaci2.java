package domaci21122020;

import java.util.Scanner;



public class Domaci2 {

	public static void main(String[] args) {
		/*Napisati program koji proverava da li je napisan niz rastuci.
		Primer1 niza: 3 54 123 18
		Ispis: Niz nije rastuci.
		Primer2 niza: 71 422 1001 5054
		Ispis: Niz je rastuci*/

		//pošto i ovde nije definisano da li se niz unosi sa tastature
		//napravila sam da je unos niza sa tastature. Praktiènije je.
		
		Scanner sken = new Scanner(System.in);
		int brojClanova = 1;
		int privremena = -2147483648; //najmanji int
		
		System.out.println("Unesite koliko želite da vaš niz ima èlanova");
		brojClanova =sken.nextInt();
		
		int[] nizBrojeva = new int[brojClanova];
		
		for (int i = 0; i < brojClanova; i++) {
			System.out.println("Unesite " + (i+1) + ". èlan niza");
			nizBrojeva[i] = sken.nextInt();	
		}
		System.out.print("Niz je: ");
		for (int i = 0; i < nizBrojeva.length; i++) {
			System.out.print(nizBrojeva[i] + " ");
		}
		for (int i = 0; i < brojClanova; i++) {
			if (privremena < nizBrojeva[i]) {
				privremena = nizBrojeva[i];
				if (privremena == nizBrojeva[(brojClanova-1)]) {
					System.out.println("\nOvaj niz je rastuæi");
				}
			}
			else {
				System.out.println("\nOvaj niz nije rastuæi");
				break;
			}
		}
	}
}
