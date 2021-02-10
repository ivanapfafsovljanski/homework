package domaci;
import java.util.Scanner;
public class Domaci1 {
	public static void main(String[] args) {
		/*
		 * 1) Napisati program gde korisnik unese ime, prezime i pol, a program mu vrati
		 * "Dobrodosao u IT" ili "Dobrodosla u IT" zavisno koji pol unese
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ime: ");
		String ime = sc.next();
		System.out.println("Unesite prezime: ");
		String prezime = sc.next();
		System.out.println("Unesite pol: ");
		String pol = sc.next();
		switch (pol) {
		case "musko": {
			System.out.println(ime + " " + prezime + " dobrodosao u IT");
		}
			break;
		case "zensko": {
			System.out.println(ime + " " + prezime + " dobrodosla u IT");
		}
			break;
		default:
			System.out.println("Validan unos je musko ili zensko");
		}
	}
}
