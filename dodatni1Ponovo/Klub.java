package dodatni1Ponovo;

import java.util.Scanner;

public class Klub {
	/*Klub poseduje naziv, sediste (grad), godinu osnivanja i sportistu. 
	 * Sva polja mogu da se dohvate, a naziv kluba moze i da se postavi.
	 */
/*Dodatak zadatku: U Klubu napraviti niz sportista tipa Sportista umesto jednog sportiste. 
 * Samim tim postojace metode koje ce dodavati i uklanjati sportistu.
 * 
 * Deo za istrazivanje: Napisati metodu koja ce ispisati ceo objekat klase klub.*/
	private String naziv;
	private String grad;
	private int godOsnivanja;
	private Sportista[] sportista;
	//ova dva atributa su dodata da bi mogli da se prikažu u listi atributa - vidljivost ime je public
	public int nekiBroj;
	public String nekaRec;
	
	public Klub () {
		
	}
	//get - set
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getGrad() {
		return grad;
	}
	public int getGodOsnivanja() {
		return godOsnivanja;
	}
	public Sportista[] getSportista() {
		return sportista;
	}
	public Klub(String naziv, String grad, int godOsnivanja, Sportista[] sportista) {
		this.naziv = naziv;
		this.grad = grad;
		this.godOsnivanja = godOsnivanja;
		this.sportista = sportista;
	}
	public Klub(String naziv, String grad, int godOsnivanja, int brojClanova) {
		
		this.naziv = naziv;
		this.grad = grad;
		this.godOsnivanja = godOsnivanja;
		sportista = new Sportista[brojClanova];
	}
	//metoda za zamenu èlana
	public void promenaClana(Sportista clan) {
		Scanner sken = new Scanner(System.in);
		int brojClana;
		System.out.println("unesite broj èlana koji želite zamenite (od 1 do 5)");
		brojClana = sken.nextInt();
		System.out.println("unesite ime novog èlana");
		
		sportista[brojClana - 1] = clan;
	}
	
	
	
	
	
	
}
