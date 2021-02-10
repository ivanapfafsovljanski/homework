package domaci15122020;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Napisati program koji ce prebrojati koliko je brojeva od 9 do 250 
		 (ukljucujuci i njih) deljivih brojem 3*/
		
		int brojac = 0;
		
		for (int i = 9; i <= 250; i++) {
			
			if (i%3 == 0) {
				brojac++;
			}
		}
		System.out.println("Izmeðu brojeva 9 i 250 ima:");
		System.out.println(brojac + " brojeva je deljivih sa 3");
	}

}
