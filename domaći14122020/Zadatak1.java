package doma�i14122020;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji ce traziti unos 3 broja sa tastature koji ce
		 * predstavljati duzinu 3 stranice nekog trougla. U zavisnosti od duzine
		 * stranice, ispisati da li je trougao jednakostranicni, jednakokraki ili
		 * raznostranican trougao.
		 */

		int a;
		int b;
		int c;

		Scanner sken = new Scanner(System.in);

		System.out.println("Unesite prvu stranicu trougla:");
		a = sken.nextInt();
		System.out.println("Unesite drugu stranicu trougla:");
		b = sken.nextInt();
		System.out.println("Unesite tre�u stranicu trougla:");
		c = sken.nextInt();
		

		if (((a + b) > c) && ((b + c) > a) && ((a + c) > b)) {
			if (a == b && b == c) {
				System.out.println("Trougao je jednakostrani�an");
			} else if (a == b || b == c || c == a) {
				System.out.println("Trougao je jednakokraki");
			} else {
				System.out.println("Trougao ima stranice razli�itih du�ina");
			}
		}
		else {
			System.out.println("Sa zadatim vrednostima stranica ne mo�e da se konstrui�e trougao");
		}
		
		System.out.println("Kraj programa");
	}

}
