package dodatniZadaci;

import java.util.Scanner;

public class Dodatni1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Napisati program koji ucitava N brojeva od korisnika
//		i ispisuje koliko je pozitivnih brojeva uneo. (edited) 
		
		Scanner sken = new Scanner(System.in);
		int unetBroj;
		int brojac = 0;
		int kolikoUnositeBrojeva;
		
		System.out.println("Unesite koliko želite brojeva da se proveri");
		kolikoUnositeBrojeva = sken.nextInt();
		for (int i = 0; i < kolikoUnositeBrojeva; i++) {
			System.out.println("Unesite " + (i+1) + ". broj");
			unetBroj = sken.nextInt();
			
			if (unetBroj > 0) {
				brojac++;
			}
		}
		System.out.println("Od unetih " + kolikoUnositeBrojeva + " brojeva uneto je " + brojac + " pozitvnih brojeva");
		
	}

}
