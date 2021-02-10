package domaci25122020;

import java.util.Scanner;

public class Domaci4 {

	public static void main(String[] args) {
		//Napisati funkciju koja racuna aritmeticku sredinu niza
		
		Scanner sken = new Scanner(System.in);
		int brojClanova;
		int aritmetickaSredina;
		System.out.println("Unesite broj èlanova niz za koji odreðujemo aritmetièku sredinu");
		brojClanova = sken.nextInt();
		int[] nizBrojeva = new int[brojClanova];
		System.out.println("Unesite èlanove niza");
		for (int i = 0; i < nizBrojeva.length; i++) {
			System.out.println((i+1) + ". èlan niza je");
			nizBrojeva[i] = sken.nextInt();
		}
		aritmetickaSredina = sredinaNiza(nizBrojeva);
		System.out.println("Aritmetièka sredina unetog niz je " + aritmetickaSredina);
		
	}
	
	public static int sredinaNiza(int[] nizBrojeva) {
		int suma = 0;
		int aritmetickaSredina = 0;
		for (int i = 0; i < nizBrojeva.length; i++) {
			suma += nizBrojeva[i];
			
			
		}
		aritmetickaSredina = suma / nizBrojeva.length;
		return aritmetickaSredina;
	}
}
