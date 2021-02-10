package domaci25122020;

import java.util.Scanner;

public class Domaci5 {

	public static void main(String[] args) {
		//Uneti niz (integer ili string) i proveriti da li je palindrom

		Scanner sken = new Scanner(System.in);
		int duzinaNiza;
		System.out.println("Unesite dužinu niz");
		duzinaNiza = sken.nextInt();
		int[] nizBrojeva = new int[duzinaNiza];
		System.out.println("Unesite niz brojeva");
		for (int i = 0; i < nizBrojeva.length; i++) {
			System.out.println((i+1) + ". èlan niza je ");
			nizBrojeva[i] = sken.nextInt();
		}
		if (palindrom(nizBrojeva) == true) {
			System.out.println("Uneti niz JE palindrom");
		}
		else
			System.out.println("Uneti niz NIJE palindrom");
	}

	public static boolean palindrom (int[] nizBrojeva) {
		boolean jeste = true;
		int j=nizBrojeva.length-1;
		for (int i = 0; i < nizBrojeva.length; i++) {
			
			
			if (nizBrojeva[i] != nizBrojeva[j]) {
				jeste = false;
				break;
			}
			j--;
		}
		return jeste;
	}
}
