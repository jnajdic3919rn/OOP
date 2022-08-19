package model;

public class Biranje {

	private String razred;
	private String predmet;
	private int broj;
	
	public Biranje(String razred, String predmet, int broj) {
		this.razred = razred;
		this.predmet = predmet;
		this.broj = broj;
	}

	public String getRazred() {
		return razred;
	}

	public void setRazred(String razred) {
		this.razred = razred;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}
	
}
