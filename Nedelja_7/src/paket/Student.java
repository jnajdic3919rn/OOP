package paket;

public class Student {

	private String ime;
	private String prezime;
	private String smer;
	
	public Student(String ime, String prezime, String smer) {
		super();
		this.ime = ime;
		this.prezime = prezime;
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

	public String getSmer() {
		return smer;
	}

	public void setSmer(String smer) {
		this.smer = smer;
	}
	
	@Override
	public int hashCode() {
		return this.ime.hashCode() + this.prezime.hashCode() + this.smer.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj.hashCode() == this.hashCode();
	}
	
	@Override
	public String toString() {
		return this.ime + " " + this.prezime;
	}
}
