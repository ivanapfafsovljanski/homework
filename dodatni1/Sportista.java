package dodatni1;

public class Sportista {
	/*Sportista poseduje ime, prezime i godinu rodjenja. 
	 * Ime, prezime i godina rodjenja se zadaju prilikom kreiranja i ne mogu da se promene. 
	 * Sportistu ispisati u obliku: IME_PREZIME: godinaRodjenja
	 */
	private String ime;
	private String prezime;
	private int godRodjenja;
	
	public Sportista(String ime, String prezime, int godiste) {
		this.ime = ime;
		this.prezime = prezime;
		godRodjenja = godiste;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getGodiste() {
		return godRodjenja;
	}
}
