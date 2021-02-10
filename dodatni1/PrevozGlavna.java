package dodatni1;

import java.util.Scanner;

import domaci1.Autobus;

public class PrevozGlavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vozac vozac1 = new Vozac("MIško", "Mišiæ", "vozaè");
		

		Scanner sken = new Scanner(System.in);
		String vrstaTransakcije;
		
		System.out.println("Unesite sumu");
		double suma = sken.nextDouble();
		
		System.out.println("Unesite vrstu transakcije: dodaj / oduzmi");
		vrstaTransakcije = sken.next();
		
		
	}

}
