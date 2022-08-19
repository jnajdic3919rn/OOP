package model;

public class Podatak {

	private String naslov;
	private String izdavac;
	private int brojPrimeraka;
	private double cena;
	
	public Podatak(String naslov, String izdavac, int brojPrimeraka, double cena) {
		this.naslov = naslov;
		this.izdavac = izdavac;
		this.brojPrimeraka = brojPrimeraka;
		this.cena = cena;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getIzdavac() {
		return izdavac;
	}

	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}

	public int getBrojPrimeraka() {
		return brojPrimeraka;
	}

	public void setBrojPrimeraka(int brojPrimeraka) {
		this.brojPrimeraka = brojPrimeraka;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}
	
	@Override
	public String toString() {
		return this.cena/this.brojPrimeraka + "-" + this.naslov + ", " + this.izdavac;
	}
}
