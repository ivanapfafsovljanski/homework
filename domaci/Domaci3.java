package domaci;
import java.util.Scanner;
public class Domaci3 {
	public static void main(String[] args) {
		/*
		 * Napisati program gde korisnik unese broj, a program mu vrati odgovor da li je
		 * unet broj prost ili ne
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int broj = sc.nextInt();
		int delilac = 0;
		for (int i = 1; i <= broj; i++) {
			if (broj % i == 0) {
				delilac++;
			}
		}
		if (delilac > 2) {
			System.out.println("Unet broj nije prost");
		} else {
			System.out.println("Unet broj je prost");
		}
	}
}
