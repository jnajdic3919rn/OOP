package paket2;

public class Klijent {

	private String ime;
	private String prezime;
	private String korisnickoIme;
	private String lozinka;
	private int godine;
	private Racun racun;
	
	public Klijent(String ime, String prezime, int godine, String korisnickoIme, String lozinka) {
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
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

	public int getGodine() {
		return godine;
	}

	public void setGodine(int godine) {
		this.godine = godine;
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public Racun getRacun() {
		return racun;
	}

	public void setRacun(Racun racun) {
		this.racun = racun;
	}
	
}
