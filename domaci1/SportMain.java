package domaci1;

public class SportMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sportista sportista1 = new Sportista("Nedeljko", "�ovljanski", 1972);
		Sportista sportista2 = new Sportista("Du�an", "�ovljanski", 1999);
		
		Klub klub1 = new Klub("Be�ej", "Be�ej", 2011, sportista2);
		System.out.println("U klubu " + klub1.getNaziv() + " takmi�i se:");
		klub1.getSportista().stampanjeSportiste();
	}

}
