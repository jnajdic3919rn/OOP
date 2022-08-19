package paket1;

import java.util.ArrayList;
import java.util.List;

public class PitanjePonudjeniOdgovori extends Pitanje {

	public PitanjePonudjeniOdgovori(String tekstPitanja, int redniBroj) {
		super(tekstPitanja, redniBroj);
		// TODO Auto-generated constructor stub
	}

	private List<String> ponudjeniOdgovori = new ArrayList<String>();
	
	
	
	public void dodajOdgovor(String odgovor) {
		ponudjeniOdgovori.add(odgovor);
	}

	@Override
	public boolean spremanZaStampu() {
		if(super.spremanZaStampu() && this.ponudjeniOdgovori.size() >= 2)
			return true;
		return false;
	}
	
	@Override
	public String vratiZaStampu() {
		String konacno = super.vratiZaStampu() + "\n";
		for(String odgovor:ponudjeniOdgovori) {
			konacno += odgovor + " ";
		}
		return konacno + "\n";
	}

	public List<String> getPonudjeniOdgovori() {
		return ponudjeniOdgovori;
	}

	public void setPonudjeniOdgovori(List<String> ponudjeniOdgovori) {
		this.ponudjeniOdgovori = ponudjeniOdgovori;
	}

}
