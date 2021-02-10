package domaci1;

public class Sportista {
	/*Sportista poseduje ime, prezime i godinu rodjenja. 
	 * Ime, prezime i godina rodjenja se zadaju prilikom kreiranja i ne mogu da se promene. 
	 * Sportistu ispisati u obliku: IME_PREZIME: godinaRodjenja
	 */

	private String ime;
	private String prezime;
	private int godinaRodjenja;
	
	//geteri
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}


	//konstruktor
	public Sportista(String ime, String prezime, int godRodjenja) {
		this.ime = ime;
		this.prezime = prezime;
		godinaRodjenja = godRodjenja;
	}
	public void stampanjeSportiste() {
		System.out.println(ime + "_" + prezime + ": " + godinaRodjenja);
	}
}
