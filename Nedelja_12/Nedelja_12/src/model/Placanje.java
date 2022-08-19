package model;

import java.util.Date;

public class Placanje {

	private int iznos;
	private String uplatPrim;
	private String datum;
	private Tip tip;
	private String kategorija;
	private static int stanje = 0;
	
	public Placanje(int iznos, String uplatPrim, String datum, String kategorija, Tip tip) {
		super();
		this.iznos = iznos;
		this.uplatPrim = uplatPrim;
		this.datum = datum;
		this.kategorija = kategorija;
		this.tip = tip;
	}
	
	public Placanje(int iznos, String uplatPrim, String datum, Tip tip) {
		super();
		this.iznos = iznos;
		this.uplatPrim = uplatPrim;
		this.datum = datum;
		this.tip = tip;
		
	}
	
	public int getIznos() {
		return iznos;
	}
	public void setIznos(int iznos) {
		this.iznos = iznos;
	}
	public String getUplatPrim() {
		return uplatPrim;
	}
	public void setUplatPrim(String uplatPrim) {
		this.uplatPrim = uplatPrim;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	
	public Tip getTip() {
		return tip;
	}

	public void setTip(Tip tip) {
		this.tip = tip;
	}

	public String getKategorija() {
		return kategorija;
	}
	public void setKategorija(String kategorija) {
		this.kategorija = kategorija;
	}

	public static int getStanje() {
		return stanje;
	}

	public static void setStanje(int stanje) {
		Placanje.stanje = stanje;
	}
	
}
