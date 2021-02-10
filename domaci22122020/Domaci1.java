package domaci22122020;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		/*Napraviti kalkulator povrsina kvadrata, pravougaonika i kruga. 
Povrsina se bira tako sto se unese kao tekst odgovarajuca figura. 
Ukoliko se unese 'izadji', program treba da se zavrsi. 
Program treba da se ponavlja dokle god se ne unese izadji.*/
		
		Scanner sken = new Scanner(System.in);
		String izbor;
		double x = 0;
		double y = 0;

		do {
			System.out.println("Unesite figuru za koju želite da izraèunate površinu");
			System.out.println("Ponuðene figure su: kvadrat, pravougaonik i krug");
			izbor = sken.next();
			if (izbor.equalsIgnoreCase("kvadrat")) {
				System.out.println("Unesite vrednost stranice kvadrata u cm");
				x = sken.nextDouble();
				
			}
			else if (izbor.equalsIgnoreCase("pravougaonik")) {
				System.out.println("Unesite vrednost jedne stranice pravougaonika u cm");
				x = sken.nextDouble();
				System.out.println("Unesite vrednost druge stranice pravougaonika u cm");
				y = sken.nextDouble();
			}
			else if (izbor.equalsIgnoreCase("krug")){
				System.out.println("Unesite vrednost polupreènika kruga u cm");
				x = sken.nextDouble();
			
			}
			else {
				System.out.println("Niste dobro odabrali figuru");
				
			}
			
			
			double povrsina = kalkulatorPovrsine(x, y, izbor);
			System.out.println("Površina " + izbor + " je " + povrsina + "cm2");
			System.out.println(" ");
			System.out.println("Za izlazak iz programa ukucajte: izadji. Za ostanak u programu ukucajte: ne.");
			System.out.println(" ");
			izbor = sken.next();
			
		} while (!(izbor.equalsIgnoreCase("izadji")));
		
		
	}
	
	public static double kalkulatorPovrsine(double x, double y, String figura) {
		
		switch (figura) {
		case "kvadrat": {
			return Math.pow(x, 2);
		}
		case "pravougaonik": {
			return x*y;
		}
		case "krug": {
			return Math.pow(x, 2) * Math.PI;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + figura);
		}
	}

}
