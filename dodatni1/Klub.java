package dodatni1;

public class Klub {
	/*Klub poseduje naziv, sediste (grad), godinu osnivanja i sportistu. 
	 * Sva polja mogu da se dohvate, a naziv kluba moze i da se postavi.
	 */
/*Dodatak zadatku: U Klubu napraviti niz sportista tipa Sportista umesto jednog sportiste. 
 * Samim tim postojace metode koje ce dodavati i uklanjati sportistu.
 * 
 * Napisati metodu koja ce ispisati ceo objekat klase klub.*/
	private String naziv;
	private String grad;
	private int godOsnivanja;
	private Sportista[] sportista;
	
	
	
	//get - set
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Sportista[] getSportista() {
		return sportista;
	}
	public void setSportista(Sportista[] sportista) {
		this.sportista = sportista;
	}
	public String getGrad() {
		return grad;
	}
	public int getGodOsnivanja() {
		return godOsnivanja;
	}
	//konstruktor
	public Klub(String naziv, String grad, int godOsnivanja) {
		
		this.naziv = naziv;
		this.grad = grad;
		this.godOsnivanja = godOsnivanja;
		
		int brojSportista = 5;
		sportista = new Sportista[brojSportista];
	}
	private int redniBrojClana = 0;
	
	public void unosSportiste(Sportista clan) {
		sportista[redniBrojClana] = clan;
		redniBrojClana++;
		
	}
	
}
