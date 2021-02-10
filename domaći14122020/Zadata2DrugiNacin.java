package domaæi14122020;

import java.util.Scanner;

public class Zadata2DrugiNacin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int ostatak;
		int proizvod;
		
		Scanner sken = new Scanner(System.in);
		
		System.out.println("Unesite ceo broj sa tastature");
		a = sken.nextInt();
		ostatak = a%2;
		
		if (ostatak == 0) {
			System.out.println("Uneti broj je paran");
			proizvod = a * 5;
			System.out.println("Uneti broj je pomnožen sa 5");
			System.out.println(a + " * 5 = " + proizvod);
		}
		else {
			System.out.println("Broj je neparan");
			proizvod = a + 6;
			System.out.println("Uneti broj je sabran sa 6");
			System.out.println(a + " + 6 = " + proizvod);
		}
		System.out.println("Kraj programa");
		
		}

}
