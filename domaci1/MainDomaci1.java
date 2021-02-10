package domaci1;

public class MainDomaci1 {

	public static void main(String[] args) {
		//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

		Igrac[] igrac = new Igrac[3];
		 igrac[0] = new Igrac("Nemanja", "Matiæ", "160898953002", 1989, 17, "desni bek", false);
		 igrac[1] = new Igrac("Tom", "Sane", "2003995265890", 1995, 8, "špic", false);
		 igrac[2] = new Igrac("Gijermo", "Oèoa", "1702985233214", 1985, 1, "golman", true);
		 
		 Trener[] trener = new Trener[2];
		 trener[0] = new Trener("Slobodan", "Boškan", "1309970563045", 1970, 12, "glavni");
		 trener[1] = new Trener("Neki", "kokošk", "05051968236510", 1968, 17, "pomoæni");


		 for (int i = 0; i < igrac.length; i++) {
			igrac[i].stampaj();
		}
		 for (int j = 0; j < trener.length; j++) {
			trener[j].stampa();
		}
}
	}
