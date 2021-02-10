package domaci;
public class Domaci2 {
	public static void main(String[] args) {
		//Napisati program koji prikazuje sve proste brojeve od 0 do 100
		int delilac = 0; 
		System.out.println("Prosti brojevi su: ");
		for (int i = 1; i <= 100; i++) { 
			for (int j = 1; j <= i; j++) {
				if (i%j==0) {
					delilac++; 
				}
			}
			if (delilac<=2) {
				System.out.println(i);
			}
			delilac = 0; 
			}
		
		}
	}