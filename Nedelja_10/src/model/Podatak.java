package model;

public class Podatak {

	private String imeIPrezime;
	private String index;
	private String nazivPredmeta;
	private String ocena;
	
	public Podatak(String imeIPrezime, String index, String nazivPredmeta, String ocena) {
		this.imeIPrezime = imeIPrezime;
		this.index = index;
		this.nazivPredmeta = nazivPredmeta;
		this.ocena = ocena;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getOcena() {
		return ocena;
	}

	public void setOcena(String ocena) {
		this.ocena = ocena;
	}
	
	@Override
	public String toString() {
		return "Index: " + this.index + " " + this.imeIPrezime + " na predmetu " + this.nazivPredmeta + " ima ocenu " + this.ocena;
	}
	
}
