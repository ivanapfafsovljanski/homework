package domaci1;

public class Vozac extends Covek{
	//Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).

	private String zanimanje;

	public Vozac(String ime, String prezime, String zanimanje) {
		super(ime, prezime);
		this.zanimanje = zanimanje;
	}
	
	

}
