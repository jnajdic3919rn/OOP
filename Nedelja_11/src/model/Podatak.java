package model;

public class Podatak {

	private String student;
	private String termin;
	private String ucionica;
	
	public Podatak(String student, String termin, String ucionica) {
		this.student = student;
		this.termin = termin;
		this.ucionica = ucionica;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getTermin() {
		return termin;
	}

	public void setTermin(String termin) {
		this.termin = termin;
	}

	public String getUcionica() {
		return ucionica;
	}

	public void setUcionica(String ucionica) {
		this.ucionica = ucionica;
	}
	
}
