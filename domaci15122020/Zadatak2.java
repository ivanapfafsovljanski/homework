package domaci15122020;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, 
		 i ispisuje njihov zbir (zbir pozitivnih brojeva).
		 primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11*/
           
		int unetBroj = 0;
		int suma = 0;
		Scanner sken = new Scanner(System.in);
		
		while (unetBroj >= 0) {
			suma = suma + unetBroj;
			System.out.println("unesite broj");
			unetBroj = sken.nextInt();
			}
		System.out.println("suma unetih brojeva do unetog negativnog broja je " + suma);
		System.out.println("Kraj programa");
	}

}
