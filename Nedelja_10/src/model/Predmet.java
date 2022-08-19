package model;

public class Predmet {

	private String naziv;
	private String profesor;
	private int espb;
	
	public Predmet(String naziv, String profesor, int espb) {
		this.naziv = naziv;
		this.profesor = profesor;
		this.espb = espb;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public int getEspb() {
		return espb;
	}

	public void setEspb(int espb) {
		this.espb = espb;
	}
	
	@Override
	public String toString() {
		return this.naziv + " predaje " + this.profesor + 
				" i vredi " + this.espb + " espb poena";
	}
	
}
