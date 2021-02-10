package domaci21122020;

import java.util.Scanner;

public class Dodatni1 {

	public static void main(String[] args) {
		/*Napisati program koji od korisnika traži da unese neki datum 
		 * i da ispiše koji je to po redu dan u godini. 
		 * Za izraèunavanje definisati i koristiti niz.
		 Npr. korisnik unese dan 28, mesec 2 i rezultat bude 59.*/

		Scanner sken = new Scanner(System.in);
		int[] brojDanaUMesecu = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int danUMesecu;
		int mesec;
		int danUGodini = 0;
		String prestupnaGodina;
		
		System.out.println("Unesite dan u mesecu");
		danUMesecu = sken.nextInt();
		
		System.out.println("Uneseite broj meseca u godini");
		mesec = sken.nextInt();
		
		if (mesec == 1) {
			if (danUMesecu > 31) {
				System.out.println("Niste uneli validnu vrednost za dan u mesecu");
			}
			else {
				danUGodini = danUMesecu;
				System.out.println(danUMesecu + "." + mesec + ". je " + danUGodini + " dan u godini.");		
			}
		}
		else {
			System.out.println("Unesite da li je godina prestupna da/ne");
			prestupnaGodina = sken.next();
			if (prestupnaGodina.equalsIgnoreCase("da")) {
				brojDanaUMesecu[1] = 29;
				System.out.println("Ako je godina prestupna");
			}
			if (danUMesecu < 1 || danUMesecu > brojDanaUMesecu[(mesec-1)]) {
				System.out.println("Niste uneli validnu vrednost za dan u mesecu");
			}
			
			else {
			
			for (int i = 0; i < mesec-1; i++) {
				
				danUGodini += brojDanaUMesecu[i];
			}
			danUGodini +=danUMesecu;
		
		System.out.println(danUMesecu + "." + mesec + ". je " + danUGodini + " dan u godini.");	
		}
	}
}
}


