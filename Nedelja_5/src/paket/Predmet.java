package paket;

public class Predmet {

	private String naziv;
	private int espb;
	private int semestar;
	
	public Predmet(String naziv, int espb, int semestar) {
		super();
		this.naziv = naziv;
		this.espb = espb;
		this.semestar = semestar;
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public int getEspb() {
		return espb;
	}
	
	public void setEspb(int espb) {
		this.espb = espb;
	}
	
	public int getSemestar() {
		return semestar;
	}
	
	public void setSemestar(int semestar) {
		this.semestar = semestar;
	}

}
