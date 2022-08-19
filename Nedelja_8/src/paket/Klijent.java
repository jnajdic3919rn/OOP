package paket;

import java.io.Serializable;

public class Klijent implements Serializable{

	private String ime;
	private String prezime;
	private Racun racun;
	
	public Klijent(String ime, String prezime, Racun racun) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.racun = racun;
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

	public Racun getRacun() {
		return racun;
	}

	public void setRacun(Racun racun) {
		this.racun = racun;
	}
	
	@Override
	public String toString() {
		return this.ime + " " + this.prezime + " racun: " + this.racun.toString();
	}
	
}
