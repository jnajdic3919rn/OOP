package paket2;

import java.util.ArrayList;

public class Banka {

	private String naziv;
	private String lokacija;
	private ArrayList<Klijent> klijenti;
	
	public Banka(String naziv, String lokacija) {
		this.naziv = naziv;
		this.lokacija = lokacija;
		klijenti = new ArrayList<Klijent>();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getLokacija() {
		return lokacija;
	}

	public void setLokacija(String lokacija) {
		this.lokacija = lokacija;
	}

	public ArrayList<Klijent> getKlijenti() {
		return klijenti;
	}

	public void setKlijenti(ArrayList<Klijent> klijenti) {
		this.klijenti = klijenti;
	}
	
	public void dodajKlijenta(Klijent k) {
		this.klijenti.add(k);
	}
	
}
