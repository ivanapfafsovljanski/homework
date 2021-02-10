package domaci1;

import java.util.ArrayList;
import java.util.Scanner;

public class PrevozMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sken = new Scanner(System.in);
		int brKarata;
		
		Vozac vozac1 = new Vozac("Miško", "Mišiæ", "vozaè");
		ArrayList<Putnik> putnik = new ArrayList<Putnik>();
		
		Putnik putnik1 = new Putnik("Nedeljko", "Šovljanski", 1000);
		Putnik putnik2 = new Putnik("Ivana", "Pfaf-Šovljanski", 600);
		Putnik putnik3 = new Putnik("Dule", "Šovljanski", 300);
		
		putnik.add(putnik1);
		putnik.add(putnik2);
		putnik.add(putnik3);
		
		Autobus vozilo1 = new Autobus("Beèej prevoz", vozac1, 420, putnik);
		
		System.out.println("Unesite potreban broj karata");
		brKarata = sken.nextInt();
		
		vozilo1.prisutanVozac();
		vozilo1.cenaPrevoza(brKarata);
		System.out.println("Ukupna cena prevoza za kupljenih " + brKarata + " je " + vozilo1.cenaPrevoza(brKarata));
		
		System.out.println("Unesite koliko novca želite da dodate/oduzmete");
		double svota = sken.nextDouble();
		
		putnik2.stanjeNovca(svota);
		
		putnik2.stanjeNovca(vozilo1.cenaPrevoza(brKarata));
		
		//obrisan vozac
		//obrisan putnik3
		vozilo1.setVozac(null);
		putnik.remove(2);
		System.out.println("---------------------------------------------------");
	
				for (int i = 0; i < putnik.size(); i++) {
			System.out.println(i+1 + ". putnik je " + putnik.get(i).getIme()+ " " + putnik.get(i).getPrezime());
		}
		
		System.out.println("Unesite potreban broj karata");
		brKarata = sken.nextInt();
		
		vozilo1.prisutanVozac();
		vozilo1.cenaPrevoza(brKarata);
		System.out.println("Ukupna cena prevoza za kupljenih " + brKarata + " je " + vozilo1.cenaPrevoza(brKarata));
		
		System.out.println("Unesite koliko novca želite da dodate/oduzmete");
		 svota = sken.nextDouble();
		
		putnik2.stanjeNovca(svota);
		
		putnik2.stanjeNovca(vozilo1.cenaPrevoza(brKarata));
		
		
		
	}

}
