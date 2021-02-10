package domaci15122020;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		 * od 0 do n - za resavanje ovog zadatka koristiti samo jednu petlju (ne jednu
		 * vrstu petlje, vec samo jednu petlju).
		 */
// podrazumeva se da se n ucitava preko tastature

		int n;
		int suma = 0;
		long proizvod = 1;
		
		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite sa tastature prirodan broj od 1 do 36");
		//ako se unese broj veæi od 36 dolazi do overflow-a na promenljivoj proizvod
		n = sken.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i%2 == 0) {
				suma = i + suma;
			}
			else {
				proizvod = proizvod * i;
				//proizvod = 9223372036854775806l / 282166592185152483l;
				//proizvod = 9223372036854775806l /1338022901564897417l;
				//9223372036854775806
				//8006580162858909745
			}
		}
		
				
		System.out.println("suma parnih brojeva do broja " + n + " je " + suma);
		System.out.println("proizvod neparnih brojeva do broja " + n + " je " + proizvod);
		System.out.println("Kraj programa");

	}

}
