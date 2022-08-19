package model;

public class UcionicaObl {

	private Ucionica u;
	private int raspolozivo;
	private String termin;
	
	public UcionicaObl(Ucionica u, String termin, int raspolozivo) {
		this.u = u;
		this.termin = termin;
		this.raspolozivo = raspolozivo;
	}

	public Ucionica getU() {
		return u;
	}

	public void setU(Ucionica u) {
		this.u = u;
	}

	public String getTermin() {
		return termin;
	}

	public void setTermin(String termin) {
		this.termin = termin;
	}
	
	public int getRaspolozivo() {
		return raspolozivo;
	}

	public void setRaspolozivo(int raspolozivo) {
		this.raspolozivo = raspolozivo;
	}

	@Override
	public String toString() {
		return u.toString() + this.raspolozivo;
	}
	
}
