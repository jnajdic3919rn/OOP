package model;

public class Student {

	private String ime;
	private String prezime;
	private int godina;
	private int brIndex;
	private String smer;
	
	public Student(String ime, String prezime, int godina, int brIndex, String smer) {
		this.ime = ime;
		this.prezime = prezime;
		this.godina = godina;
		this.brIndex = brIndex;
		this.smer = smer;
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

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}

	public int getBrIndex() {
		return brIndex;
	}

	public void setBrIndex(int brIndex) {
		this.brIndex = brIndex;
	}

	public String getSmer() {
		return smer;
	}

	public void setSmer(String smer) {
		this.smer = smer;
	}
	
	@Override
	public String toString() {
		return this.ime + " " + this.prezime + " " + this.brIndex + "/" + this.smer + "-" + this.godina;
	}
}
