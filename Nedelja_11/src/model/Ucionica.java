package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ucionica {

	private String naziv;
	private String tip;
	private int brojStudenata;
	private Map<String, Integer> poTerminima = new HashMap<>();
	
	public Ucionica(String naziv, String tip) {
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

	public int getBrojStudenata() {
		return brojStudenata;
	}

	public void setBrojStudenata(int brojStudenata) {
		this.brojStudenata = brojStudenata;
	}
	
	public Map<String, Integer> getPoTerminima() {
		return poTerminima;
	}

	@Override
	public String toString() {
		if(this.tip.equals("N"))
			return this.naziv + " - "; ///+ this.brojStudenata;
		else
			return this.naziv + "(" + this.tip + ")" + " - "; ///+ this.brojStudenata;
	}
	
	public void studentiPoTerminima(Integer termini, int brojStudenata) {
		for(int i = 1; i<=termini; i++){
			poTerminima.put("termin" + i, brojStudenata);
		}
	}
	
}
