package model;

public class Podatak {

	private String termin;
	private String ucionica;
	private String student;
	
	public Podatak(String termin, String ucionica, String student) {
		this.termin = termin;
		this.ucionica = ucionica;
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
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	
}
