package domaæi;
public class Domaci2 {
	public static void main(String[] args) {
	/*2) Napisati funkciju koja vraca sumu dva niza, 
	 * zatim od niza sa vecom sumom oduzme sumu drugog niza i 
	 * vrati da li je veci niz i dalje veci
	Primer:
	Ako se unese prvi niz 1,2,3 (suma je 6) i 
	drugi niz 10,20,30 (suma 60) onda 60 - 6 = drugi niz je 
	i dalje veci, vraca true.*/
		int[] niz1 = {15, 20, 56, 12, 13}; 
		int[] niz2 = {-3, -2, -1, -4}; 
		System.out.println("Da li je suma niza i dalje veca: " ); 
		poredjenje(niz1, niz2);
		
	}
	public static void poredjenje(int[] niz1, int[] niz2) {
		int suma1 = 0; 
		for (int i = 0; i < niz1.length; i++) {
			suma1 = suma1 + niz1[i]; 
		}
		int suma2 = 0; 
		for (int i = 0; i < niz2.length; i++) {
			suma2 = suma2 + niz2[i]; 
		} 
		int rezultat1; 
		int rezultat2;
		int razlika1; 
		int razlika2; 
		if (suma1>suma2) {
			razlika1 = suma1-suma2; 
			if (razlika1>suma2) {
				rezultat1 = razlika1-suma2; 
				if (rezultat1>suma2) {
					System.out.println(" true");
				}
				else {
					System.out.println(" false");
				}
			}
			
		}
		else if (suma2>suma1) {
			razlika2 = suma2-suma1; 
			if (razlika2>suma1) {
				rezultat2 = razlika2-suma1; 
				if (rezultat2>suma1) {
					System.out.println(" true");
				}
				else {
					System.out.println(" false"); 
				}
			}
			
			
		}
		else {
			System.out.println(" false"); 
		}
		
	}
}