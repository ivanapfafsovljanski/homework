package domaci1;

public class KnjigeGlavna {

	public static void main(String[] args) {
		//  U glavnom programu napraviti vise autora sa vise knjiga.

		Autor autor1 = new Autor("Ju", "Nezbe");
		Autor autor2 = new Autor("Branislav", "Nu�i�");
		Knjiga knjiga1 = new Knjiga("123654NB", "Sne�ko", 2011, autor1);
		Knjiga knjiga2 = new Knjiga("369852BN", "Slepi mi�", 2003, autor1);
		Knjiga knjiga3 = new Knjiga("32147852AS", "Autobiografija", 1983, autor2);
		Knjiga knjiga4 = new Knjiga("2587413SA", "Put oko sveta", 1983, autor2);
		
		knjiga1.print();
		System.out.println("_______________________________");
		knjiga2.print();
		System.out.println("_______________________________");
		knjiga3.print();
		System.out.println("_______________________________");
		knjiga4.print();
	}

}
