package domaci1;

public class SportMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sportista sportista1 = new Sportista("Nedeljko", "Šovljanski", 1972);
		Sportista sportista2 = new Sportista("Dušan", "Šovljanski", 1999);
		
		Klub klub1 = new Klub("Beèej", "Beèej", 2011, sportista2);
		System.out.println("U klubu " + klub1.getNaziv() + " takmièi se:");
		klub1.getSportista().stampanjeSportiste();
	}

}
