package model;

public class Ucionica {

	private String naziv;
	private String tip;
	
	public Ucionica(String naziv, String tip) {
		super();
		this.naziv = naziv;
		this.tip = tip;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	@Override
	public String toString() {
		if(this.tip.equals("N"))
			return this.naziv + " - ";
		
		return this.naziv + "(" + this.tip + ")" + " - ";
	}
	
}
