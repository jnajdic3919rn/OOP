package paket1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PopunjavanjePraznihMesta extends Pitanje{

	private int brojDonjihCrtica;
	private List<Integer> pozicija = new ArrayList<Integer>();
	
	public PopunjavanjePraznihMesta(String tekstPitanja, int redniBroj) {
		super(tekstPitanja, redniBroj);
		// TODO Auto-generated constructor stub
	}
	
	public int getBrojDonjihCrtica() {
		return brojDonjihCrtica;
	}

	public void setBrojDonjihCrtica(int brojDonjihCrtica) {
		this.brojDonjihCrtica = brojDonjihCrtica;
	}

	public List<Integer> getPozicija() {
		return pozicija;
	}

	public void setPozicija(List<Integer> pozicija) {
		this.pozicija = pozicija;
	}

	@Override
	public boolean spremanZaStampu() {
		int duzina = super.getTekstPitanja().split(" ").length;
		Collections.sort(pozicija);
		if(pozicija.size() >= 1 && pozicija.get(pozicija.size()-1) <= duzina)
			return true;
		
		return false;
	}
	
	@Override
	public String vratiZaStampu() {
		String konacno = super.getRedniBroj() + ". (" + super.getBrojPoena() + ") ";
		String[] tekst = super.getTekstPitanja().split(" ");
		int duzina = tekst.length;
		for(int i = 0; i<duzina; i++) {
			konacno+=tekst[i] + " ";
			if(pozicija.contains(i+1)) {
				for(int j = 0; j<this.brojDonjihCrtica; j++)
					konacno += "_";
			}
			konacno+=" ";
		}
		return konacno;
	}

}
