package model;

public class UcionicaPoTerminu {

	private Ucionica ucionica;
	private int kapacitet;
	private String termin;
	
	public UcionicaPoTerminu(Ucionica ucionica, int kapacitet, String termin) {
		this.ucionica = ucionica;
		this.kapacitet = kapacitet;
		this.termin = termin;
	}

	public Ucionica getUcionica() {
		return ucionica;
	}

	public void setUcionica(Ucionica ucionica) {
		this.ucionica = ucionica;
	}

	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}

	public String getTermin() {
		return termin;
	}

	public void setTermin(String termin) {
		this.termin = termin;
	}
	
	@Override
	public String toString() {
		return ucionica.toString() + this.kapacitet;
	}
}
