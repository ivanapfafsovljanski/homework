package dodatni1;

public class Dodatni1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sportista[] clan = new Sportista[5];
		Sportista tempClan = new Sportista("Du�an", "�ovljanski", 1999);
		clan[0] = tempClan;
		tempClan = new Sportista("Milo�", "�ovljanski", 2001);
		 clan[1]= tempClan;
		 tempClan = new Sportista("Jovan", "�ovljanski", 2007);
		 clan[2] = tempClan;
		 clan[3] = new Sportista("Nedeljko", "�ovljanski", 1972);
		 clan[4] = new Sportista("Ivana", "Pfaf-�ovljanski", 1973);
		
		Klub klub1 = new Klub("Vitezovi Chardaque", "Provanssa", 2021);
		
		for (int j = 0; j < clan.length; j++) {
			klub1.unosSportiste(clan[j]);
			System.out.println(clan[j].getIme() + " " + clan[j].getPrezime() + ": " + clan[j].getGodiste());
		}
		
		
	}

}
