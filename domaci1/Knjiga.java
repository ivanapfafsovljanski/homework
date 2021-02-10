package domaci1;

public class Knjiga {
/*Kreirati klasu Knjiga koji ima:
-ISBN
-naziv
-godina izdanja
-autor
-konstuktore koje mislite da su vam potrebni
-gettere i settere za atribute
-metodu print koja stampa u formatu (izbegavati dupliranje koda):
(ISBN)
(naziv) - (godina izdanja)
autor: (ime autora) (prezime autora)*/
	private String ISBN;
	private String naziv;
	private int godinaIzdanja;
	private Autor autor;
	
	public Knjiga(String iSBN, String naziv, int godinaIzdanja, Autor autor) {
		super();
		ISBN = iSBN;
		this.naziv = naziv;
		this.godinaIzdanja = godinaIzdanja;
		this.autor = autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	/*-metodu print koja stampa u formatu (izbegavati dupliranje koda):
(ISBN)
(naziv) - (godina izdanja)
autor: (ime autora) (prezime autora)*/
	public void print() {
		System.out.println("(" + ISBN + ")");
		System.out.println("(" + naziv + ")" + " - " + "(" + godinaIzdanja + ")");
		System.out.print("autor: ");
		autor.print();
	}
	
	
}
