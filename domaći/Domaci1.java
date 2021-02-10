package domaæi;
import java.util.Scanner;
public class Domaci1 {
	public static void main(String[] args) {
	/*1) Napisati funkciju koja za parametre prima tri broja 
	 * num1, num2 i num3 i proverava da li je zbir num1 i num2 
	 * jednak num3.
	Primer:
	Ako se unese num1 = 2, num2 = 4, i num3 = 99 vraca false
	Ako se unese num1 = 2, num2 = 4, i num3 = 6 vraca true*/
		Scanner sc = new Scanner(System.in); 
		int broj1; 
		int broj2; 
		int broj3; 
		boolean check = true; 
		System.out.println("Unesite prvi broj: ");
		broj1 = sc.nextInt(); 
		System.out.println("Unesite drugi broj: ");
		broj2 = sc.nextInt(); 
		System.out.println("Unesite treci broj: ");
		broj3 = sc.nextInt(); 
		provera(broj1, broj2, broj3); 
	}
	public static void provera(int broj1,int broj2, int broj3) {
		
		int suma = 0; 
		suma = broj1+broj2; 
		if (suma == broj3) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		
	}
}
