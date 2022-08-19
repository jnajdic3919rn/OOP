package paket1;

public class Zaposljen {

	private String ime;
	private String prezime;
	private double plata;
	private Odsek odsek;
	
	public Zaposljen(String ime, String prezime, Odsek odsek) {
		this.ime = ime;
		this.prezime = prezime;
		this.odsek = odsek;
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

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

	public Odsek getOdsek() {
		return odsek;
	}

	public void setOdsek(Odsek odsek) {
		this.odsek = odsek;
	}
	
	public void obracunajPlatu(int brojSati, double cenaPoSatu) {
		this.plata = brojSati*cenaPoSatu;
	}
	
}
