package paket1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test implements ZaStampanje{
	
	private String naslov;
	private List<Pitanje> pitanja = new ArrayList<Pitanje>();

	public Test() {
		
	}
	
	public Test(String naslov) {
		super();
		this.naslov = naslov;
	}
	
	public boolean dodajPitanje(Pitanje pitanje) {
		return true;
	}

	@Override
	public String vratiZaStampu() {
		int brojPoena = 0;
		for(Pitanje p:pitanja)
			brojPoena+=p.getBrojPoena();
		String konacno = this.naslov + "\n" + brojPoena + "\n";
		
		for(Pitanje p:pitanja)
			konacno += p.vratiZaStampu();
		
		return konacno;
	}

	@Override
	public boolean spremanZaStampu() {
		boolean flag = true;
		Collections.sort(this.pitanja);
		for(int i = 0; i<this.pitanja.size(); i++) {
			if(this.pitanja.get(i).getRedniBroj() != i+1) {
				flag = false;
				break;
			}
			if(!this.pitanja.get(i).spremanZaStampu()) {
				flag = false;
				break;
			}	
		}
	
		return flag;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public List<Pitanje> getPitanja() {
		return pitanja;
	}

	public void setPitanja(List<Pitanje> pitanja) {
		this.pitanja = pitanja;
	}

	
}
