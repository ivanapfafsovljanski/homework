package domaci1;

public class Trener extends Osoba{
/*Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
godine iskustva
tip trenera (kondicioni, za igru, pomocni, personalni)
metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.*/
	private int godineIskustva;
	private String vrstaTrenera;
	
	
	public Trener(String ime, String prezime, String jmbg, int godinaRoðenja, int godineIskustva, String vrstaTrenera) {
		super(ime, prezime, jmbg, godinaRoðenja);
		this.godineIskustva = godineIskustva;
		this.vrstaTrenera = vrstaTrenera;
	}


	public void stampa() {
		super.stampaj();
		System.out.println(" ,(" + godineIskustva + "), (" + vrstaTrenera + ")");
	}
}
