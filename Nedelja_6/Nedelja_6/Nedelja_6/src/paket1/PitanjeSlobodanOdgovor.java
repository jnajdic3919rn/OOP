package paket1;

public class PitanjeSlobodanOdgovor extends Pitanje{

	public PitanjeSlobodanOdgovor(String tekstPitanja, int redniBroj) {
		super(tekstPitanja, redniBroj);
		// TODO Auto-generated constructor stub
	}

	private int brojLinija;
	
	

	@Override
	public boolean spremanZaStampu() {
		if(super.spremanZaStampu() && this.brojLinija > 0)
			return true;
		return false;
	}
	
	@Override
	public String vratiZaStampu() {
		String konacno = super.vratiZaStampu() + "\n";
		for(int i=0; i<this.brojLinija; i++)
			konacno += "_";
		return konacno + "\n";
	}

	public int getBrojLinija() {
		return brojLinija;
	}

	public void setBrojLinija(int brojLinija) {
		this.brojLinija = brojLinija;
	}
	
}
