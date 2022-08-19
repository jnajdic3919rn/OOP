package model;

public class Podatak {

	private String kategorija;
	private int iznos;
	private int brojPlacanja;
	
	public Podatak(String kategorija, int iznos, int brojPlacanja) {
		this.kategorija = kategorija;
		this.iznos = iznos;
		this.brojPlacanja = brojPlacanja;
	}

	public String getKategorija() {
		return kategorija;
	}

	public void setKategorija(String kategorija) {
		this.kategorija = kategorija;
	}

	public int getIznos() {
		return iznos;
	}

	public void setIznos(int iznos) {
		this.iznos = iznos;
	}

	public int getBrojPlacanja() {
		return brojPlacanja;
	}

	public void setBrojPlacanja(int brojPlacanja) {
		this.brojPlacanja = brojPlacanja;
	}
	
	@Override
	public String toString() {
		return this.kategorija + "(" + this.brojPlacanja + " placanja): " + this.iznos + " RSD";
	}
}
