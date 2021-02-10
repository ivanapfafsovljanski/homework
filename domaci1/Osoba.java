package domaci1;

public class Osoba {
/*Kreirati klasu Osoba koja ima:
ime i prezime
jmbg
godinu rodjenja
default-ni konstuktor
konstuktor sa parametrima
gettere i settere
metodu stampaj koja stampa u formatu:
(ime i prezime), (jmbg), (godina rodjenja)*/

private String ime;
private String prezime;
private String jmbg;
private int godinaRoðenja;


public Osoba() {
	
}
public Osoba(String ime, String prezime, String jmbg, int godinaRoðenja) {
	super();
	this.ime = ime;
	this.prezime = prezime;
	this.jmbg = jmbg;
	this.godinaRoðenja = godinaRoðenja;
}
public String getIme() {
	return ime;
}
public void setIme(String ime) {
	this.ime = ime;
}
public String getPrezime() {
	return prezime;
}
public void setPrezime(String prezime) {
	this.prezime = prezime;
}
public int getGodinaRoðenja() {
	return godinaRoðenja;
}
public void setGodinaRoðenja(int godinaRoðenja) {
	this.godinaRoðenja = godinaRoðenja;
}
public String getJmbg() {
	return jmbg;
}
//(ime i prezime), (jmbg), (godina rodjenja)
public void stampaj() {
	System.out.print("(" + ime + " i " + prezime + ")" + ", (" + jmbg + ") (" + godinaRoðenja + ")");
}


}
