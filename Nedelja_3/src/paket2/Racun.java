package paket2;

import java.util.ArrayList;

public class Racun {

	private String broj;
	private double stanje;
	private Banka banka;
	private ArrayList<Transakcija> transakcije;
	
	public Racun(String broj, Banka banka) {
		this.broj = broj;
		this.banka = banka;
		this.transakcije = new ArrayList<>();
	}

	public double getStanje() {
		return stanje;
	}

	public void setStanje(double stanje) {
		this.stanje = stanje;
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public Banka getBanka() {
		return banka;
	}

	public void setBanka(Banka banka) {
		this.banka = banka;
	}

	public ArrayList<Transakcija> getTransakcije() {
		return transakcije;
	}

	public void setTransakcije(ArrayList<Transakcija> transakcije) {
		this.transakcije = transakcije;
	}

	public boolean podigniNovac(double suma)
	{
		if(suma <= this.stanje) {
			this.stanje -= suma;
			transakcije.add(new Transakcija(123, "13:00:56", TipTransakcije.PODIZANJE));
			return true;
		}
		
		return false;
	}
	
	public void uplatiNovac(double suma)
	{
		this.stanje += suma;
		transakcije.add(new Transakcija(123, "13:00:56", TipTransakcije.UPLATA));
	}
}
