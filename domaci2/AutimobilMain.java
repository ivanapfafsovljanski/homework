package domaci2;

public class AutimobilMain {

	public static void main(String[] args) {
		
		Automobili mojAuto = new Automobili("KIA", "Stonic", 123654789, "Ivana Pfaf-Šovljanski");
		Automobili neninAuto = new Automobili("BMW", "328iGT", 987456321, "Nedeljko Šovljanski");
	
		
		mojAuto.ispisPodataka();
		neninAuto.ispisPodataka();
		
		/*mojAuto.setOAutu("Kia", "ceed", 321656497, "ja");
		mojAuto.ispisPodataka();*/

		mojAuto.setVlasnik("Dušan Šovljanski");
		mojAuto.ispisPodataka();
		
	}

}
