package doma�i14122020;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Napisati program koji ce proveravati da li je uneti broj parni ili neparni.
Dodatak zadatku za vezbu(neobavezno): Ako je broj parni, moziti sa 5 a neparni mnoziti 
sa 6 i ispisati racun tog mnozenja.*/
		int a;
		int koli�nik;
		int provera;
		int proizvod;
		
		Scanner sken = new Scanner(System.in);
		
		System.out.println("Unesite ceo broj sa tastature");
		a = sken.nextInt();
		
		koli�nik = a/2;
		provera = koli�nik * 2;
		
		if (provera == a) {
			System.out.println("Broj je paran");
			proizvod = a * 5;
			System.out.println("Uneti broj je pomno�en sa 5");
			System.out.println(a + " * 5 = " + proizvod);
		}
		else {
			System.out.println("Broj je neparan");
			proizvod = a * 6;
			System.out.println("Uneti broj je pomno�en sa 6");
			System.out.println(a + " * 6 = " + proizvod);
		}
		System.out.println("Kraj programa");
	}

}
