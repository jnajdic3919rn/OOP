package paket2;

public class Transakcija {

	private int sifra;
	private String vreme;
	private TipTransakcije tip;
	
	public Transakcija(int sifra, String vreme, TipTransakcije tip) {
		this.sifra = sifra;
		this.vreme = vreme;
		this.tip = tip;
	}
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getVreme() {
		return vreme;
	}
	public void setVreme(String vreme) {
		this.vreme = vreme;
	}
	public TipTransakcije getTip() {
		return tip;
	}
	public void setTip(TipTransakcije tip) {
		this.tip = tip;
	}
	
	
	
}
