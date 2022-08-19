package paket;

import java.io.Serializable;

public class Racun implements Serializable{

	private String brojRacun;
	private double raspolozivo;
	private String banka;
	
	public Racun(String brojRacun, double raspolozivo, String banka) {
		super();
		this.brojRacun = brojRacun;
		this.raspolozivo = raspolozivo;
		this.banka = banka;
	}

	public String getBrojRacun() {
		return brojRacun;
	}

	public void setBrojRacun(String brojRacun) {
		this.brojRacun = brojRacun;
	}

	public double getRaspolozivo() {
		return raspolozivo;
	}

	public void setRaspolozivo(double raspolozivo) {
		this.raspolozivo = raspolozivo;
	}

	public String getBanka() {
		return banka;
	}

	public void setBanka(String banka) {
		this.banka = banka;
	}
	
	@Override
	public String toString() {
		return this.banka + " raspolozivo: " + this.raspolozivo;
	}
}
