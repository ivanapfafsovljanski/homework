package domaci15122020;

import java.util.Scanner;

public class Dodatni2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Napisati program koji ce ispisati n brojeva Fibonacijevog niza.
(Na internetu istraziti sta je Fibonacijev niz!!!)*/

		int x = 0;
		int y = 1;
		int suma;
		
		int unetBroj;
		
		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite broj koèilo èlanova treba da ima Fibonaèijev niz");
		unetBroj = sken.nextInt();
		//sa promenljivima tipa int može maksimalno 46 èlanova niza da se izreèuna
		System.out.println("Fibonaèijev niz od " + unetBroj + " èine ovi brojevi");
		System.out.println(x);
		
		for (int i = 0; i < unetBroj; i++) {
			System.out.println(y);
			suma = x + y;
			x = y;
			y = suma;
			
		}
		
	}

}
