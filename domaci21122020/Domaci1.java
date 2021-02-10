package domaci21122020;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		/*Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim redosledom.
		Primer niza: 32 54 123 18
		Ispis: 18 123 54 32*/
		
		Scanner sken = new Scanner(System.in);
		int n;
		
		System.out.println("Unesite koliko želite da veš niz ima èlanova");
		n = sken.nextInt();
		
		int[] nizBrojeva = new int[n];
		for (int i = 0; i <n; i++) {
			System.out.println("Unesite broj " + (i + 1) +". u niz ");
			nizBrojeva[i] = sken.nextInt();	
		}
		
		System.out.println("Vaš niz obrnutim redosledom je ");
		for (int i = (n-1); i >= 0; i--) {
			
			System.out.println(nizBrojeva[i]);
		}
		
	}

}
