package paket1;

public class Odsek {

	private String kompanija;
	private String naziv;
	private int brojZaposljenih;
	
	public Odsek(String kompanija, String naziv, int brojZaposljenih) {
		this.kompanija = kompanija;
		this.naziv = naziv;
		this.brojZaposljenih = brojZaposljenih;
	}

	public String getKompanija() {
		return kompanija;
	}

	public void setKompanija(String kompanija) {
		this.kompanija = kompanija;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getBrojZaposljenih() {
		return brojZaposljenih;
	}

	public void setBrojZaposljenih(int brojZaposljenih) {
		this.brojZaposljenih = brojZaposljenih;
	}
	
}
