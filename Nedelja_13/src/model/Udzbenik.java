package model;

import java.util.List;

public class Udzbenik {

	private String naslov;
	private List<String> autori;
	private String razred;
	private String izdavac;
	private String predmet;
	private double cena;
	private int brojPrimeraka;
	
	public Udzbenik(String naslov, List<String> autori, String razred, String izdavac, String predmet, double cena,
			int brojPrimeraka) {
		this.naslov = naslov;
		this.autori = autori;
		this.razred = razred;
		this.izdavac = izdavac;
		this.predmet = predmet;
		this.cena = cena;
		this.brojPrimeraka = brojPrimeraka;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public List<String> getAutori() {
		return autori;
	}

	public void setAutori(List<String> autori) {
		this.autori = autori;
	}

	public String getRazred() {
		return razred;
	}

	public void setRazred(String razred) {
		this.razred = razred;
	}

	public String getIzdavac() {
		return izdavac;
	}

	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public int getBrojPrimeraka() {
		return brojPrimeraka;
	}

	public void setBrojPrimeraka(int brojPrimeraka) {
		this.brojPrimeraka = brojPrimeraka;
	}
	
	@Override
	public String toString() {
		return this.brojPrimeraka + "-" + this.naslov + ", " + this.autori + ", " + this.izdavac + ", " + this.cena;
	}
	
}
