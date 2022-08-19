package paket1;

import java.util.ArrayList;

public class Predmet {

	private String naziv;
	private ArrayList<String> sifraPredmeta;
	private String predavac;
	private int espb;
	
	public Predmet(String naziv, String predavac, int espb) {
		this.naziv = naziv;
		this.predavac = predavac;
		this.espb = espb;
		sifraPredmeta = new ArrayList<String>();
	}
	
	/// Geteri i seteri
	
	public String getNaziv() {
		return this.naziv;
	}
	
	public ArrayList<String> getSifraPredmeta() {
		return this.sifraPredmeta;
	}
	
	public String getPredavac() {
		return this.predavac;
	}
	
	public int getEspb() {
		return this.espb;
	}
	
	public void setSifraPredmeta(ArrayList<String> sifraPredmeta) {
		this.sifraPredmeta = sifraPredmeta;
	}
	
	public void dodajSifru(String sifra) {
		this.sifraPredmeta.add(sifra);
	}
	
}
