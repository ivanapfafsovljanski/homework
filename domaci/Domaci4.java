package domaci;
public class Domaci4 {
	public static void main(String[] args) {
		//Napisati funkciju koja racuna aritmeticku sredinu niza
		int[] niz = {2, 4, 5, 8, 1, 100, 50, 72};
		double konacno = rezultat(niz); 
		
		System.out.println("Aritmeticka sredina niza je " + konacno);
	}
	public static double rezultat(int[] niz) {
		int suma = 0; 
		double sredina = 0; 
		for (int i = 0; i < niz.length; i++) {
			suma = suma + niz[i]; 	
			sredina = suma/niz.length;
		}
		
		return sredina;
		
	}
}
