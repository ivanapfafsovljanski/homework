package domaci2;

public class AutimobilMain {

	public static void main(String[] args) {
		
		Automobili mojAuto = new Automobili("KIA", "Stonic", 123654789, "Ivana Pfaf-�ovljanski");
		Automobili neninAuto = new Automobili("BMW", "328iGT", 987456321, "Nedeljko �ovljanski");
	
		
		mojAuto.ispisPodataka();
		neninAuto.ispisPodataka();
		
		/*mojAuto.setOAutu("Kia", "ceed", 321656497, "ja");
		mojAuto.ispisPodataka();*/

		mojAuto.setVlasnik("Du�an �ovljanski");
		mojAuto.ispisPodataka();
		
	}

}
