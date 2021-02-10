package domaci25122020;

public class Domaci2 {

	public static void main(String[] args) {
		//Napisati program koji prikazuje sve proste brojeve od 0 do 100
		
		//niz mora krenuti od 1, a ne od 0, jer je nula specifièna i ne mogu se na nju 
		//primeniti pravila za proste brojeve
		
		System.out.println("Prosti brojevi od 1 da 100 su:");
		for (int i = 1; i <= 100; i++) {
			
			if (i%2!=0 || i==2) {
				if(i%3!=0 || i==3){
					if(i%5!=0 || i==5) {
						if(i%7!=0 || i==7) {
							System.out.println(i);
						}
					}
				}
			}
		}
	}

}
