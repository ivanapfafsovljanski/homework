package domaci17122020;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*Napisite program gde korisnik unosi broj godina i broj velicine obuce. 
		 * Ako su uneseni brojevi parni treba ih sabrati, ako je barem jedan unet broj neparan onda ih pomnoziti. 
		 * Resenje prikazati na kraju.*/
		
		int godine;
		int brojCipela;
		int suma = 0;
		int proizvod = 1;
		
		Scanner sken = new Scanner(System.in);
		System.out.println("Molim vas da unesete svoj broj godina");
		godine = sken.nextInt();
		System.out.println("Molim Vas da unesete svoj broj cipela");
		brojCipela = sken.nextInt();
		
		if (godine%2 == 0 && brojCipela%2 == 0) {
			suma = godine + brojCipela;
			System.out.println("Suma Vašeg broja godina i broja cipela je " + suma);
		}
		else {
			proizvod = godine * brojCipela;
			System.out.println("Proizvod Vaših godina i broja cipela je " + proizvod);
		}
		System.out.println("Kraj programa");
	}

}
