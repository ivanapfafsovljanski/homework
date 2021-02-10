package itbootcamp;

public class Domaci1112 {

	public static void main(String[] args) {
		/*Ispisite podatke o nekom glumcu i glumici tako sto cete 
		 * ime i prezime prikazati kao dve promenljive, pol kao karakter, 
		 * godine kao integer, vasa ocena njih od 1 do 10 (sa decimalom) i 
		 * da li je iz Srbije odgovorite preko booleana. Na kraju zakomentarisite 
		 * u eclipse jedan film u kom se pojavljuju (dakle sve potrebno za glumca i 
		 * glumicu da budu dva ispisa)*/
		/*Ako jedna stranica trougla iznosi 5 cm, druga iznosi 10 cm, koliko iznosi treca stranica?
(za ovo ce vam trebati mozda malo guglanja ali nema mnogo pisanja, koristi se Pitagorina teorema.
 Funkcija za koren je "math.sqrt(promenljiva)" ili "sqrt(promenljiva)"*/
		
		
		String firstM, firstF, lastM, lastF;
		char sexM, sexF;
		int ageM, ageF;
		float gradeM, gradeF;
		boolean boolT = true;
		boolean boolN = false;
		
		firstM = "Bora";
		lastM = "Todoroviæ";
		sexM = 'M';
		//pošto je preminuo, navešæu koliko je imao godina kad je umro
		ageM = 85;
		gradeM = 9.75f;
		
		//film u kojem je igrao je "Profesionalac"
		
		firstF = "Charlize";
		lastF = "Theron";
		sexF = 'F';
		ageF = 45;
		gradeF = 9.54f;
		
		//film u kojem je igrala je "Italian job"
		
		System.out.println("Glumac se zove " + firstM + " " + lastM + " i pol mu je " + sexM+
				" ima " + ageM + " godina.");
		System.out.println("Moja ocena za njega je " + gradeM);
		System.out.println("Iz Srbije je " + boolT);
		System.out.println("");
		System.out.println("Glumica se zove " + firstF + " " + lastF + " i pol joj je " + sexF + 
				" ima " + ageF + " godina.");
		System.out.println("Moja ocena za nju je " + gradeF);
		System.out.println("Iz Srbije je " + boolN);
		
		
		
		
		double a = 5;
		double b = 10;
		//ako su a i b katete, onda je
		double c = a*a + b*b;
		c = Math.sqrt(c);
		System.out.println("Za katete pravouglog trougla " + a +" i " + b +" hipotenuza je "+ c);
		//ako je a kateta, b je hipotenuza, onda je
		double d = b*b - a*a;
		d = Math.sqrt(d);
		System.out.println("Za hipotenuzu pravouglog trougla " + b + " i " + "katetu " + a +
				" druga kateta je " +d);
		//i ovaj uslov je zadovoljen jer je zbir kraæik stranica veæi od
		//dužine najduže, tj. može da se nacrta trougao
		
		/*Ispisite podatke o nekom glumcu i glumici tako sto cete ime i prezime prikazati 
		 * kao dve promenljive, pol kao karakter, godine kao integer, vasa ocena njih od 1 do 10 
		 * (sa decimalom) i da li je iz Srbije odgovorite preko booleana. Na kraju 
		 * zakomentarisite u eclipse jedan film u kom se pojavljuju (dakle sve potrebno za 
		 * glumca i glumicu da budu dva ispisa)*/
		
		
	}

}
