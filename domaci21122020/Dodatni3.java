package domaci21122020;

import java.util.Scanner;

public class Dodatni3 {

	public static void main(String[] args) {
		/*Napisati program koji traži od korisnika da unese deset celih brojeva, 
		 * uèitava ih u niz, zatim sortira brojeve u rastuæem rasporedu te ih na kraju štampa*/
		
		
		Scanner sken = new Scanner(System.in);
		int[] nizBrojeva = new int[10];
		int k = 0;
		int j = 0;
		int min = nizBrojeva[0];
		
		System.out.println("Unesite brojeve niza");
		for (int i = 0; i < nizBrojeva.length; i++) {
			System.out.println((i+1) + ". ènal niza je: ");
			nizBrojeva[i] = sken.nextInt();	
		}
		
		for (int i = 0; i < nizBrojeva.length; i++) {
			min = nizBrojeva[i];
			j = i;
			k = i;
			for (; j < nizBrojeva.length; j++) {
				if (min > nizBrojeva[j]) {
					min = nizBrojeva[j];
					k=j;
					
					}
				}
			nizBrojeva[k] = nizBrojeva[i];
			nizBrojeva[i] = min;
			System.out.println(nizBrojeva[i]);
		}
		
	}

}
