package domaci25122020;

import java.util.Scanner;

public class Domaci4 {

	public static void main(String[] args) {
		//Napisati funkciju koja racuna aritmeticku sredinu niza
		
		Scanner sken = new Scanner(System.in);
		int brojClanova;
		int aritmetickaSredina;
		System.out.println("Unesite broj �lanova niz za koji odre�ujemo aritmeti�ku sredinu");
		brojClanova = sken.nextInt();
		int[] nizBrojeva = new int[brojClanova];
		System.out.println("Unesite �lanove niza");
		for (int i = 0; i < nizBrojeva.length; i++) {
			System.out.println((i+1) + ". �lan niza je");
			nizBrojeva[i] = sken.nextInt();
		}
		aritmetickaSredina = sredinaNiza(nizBrojeva);
		System.out.println("Aritmeti�ka sredina unetog niz je " + aritmetickaSredina);
		
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
