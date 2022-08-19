package paket1;

import java.util.ArrayList;
import java.util.List;

public class PitanjePovezivanje extends Pitanje {


	public PitanjePovezivanje(String tekstPitanja, int redniBroj) {
		super(tekstPitanja, redniBroj);
		// TODO Auto-generated constructor stub
	}

	private List<String> prvaKolona = new ArrayList<String>();
	private List<String> drugaKolona = new ArrayList<String>();
	private int brojPraznihMesta;
	
	

	@Override
	public boolean spremanZaStampu() {
		if(super.spremanZaStampu() && this.prvaKolona.size() > 1 && this.prvaKolona.size() == this.drugaKolona.size())
			return true;
		return false;
	}
	
	@Override
	public String vratiZaStampu() {
		String konacno = super.vratiZaStampu() + "\n";
		for(int i = 0; i<this.prvaKolona.size(); i++) {
			konacno += this.prvaKolona.get(i);
			for(int j = 0; j<this.brojPraznihMesta; j++)
				konacno += " ";
			konacno += this.drugaKolona.get(i) + "\n";
		}
		return konacno;
	}

	public List<String> getPrvaKolona() {
		return prvaKolona;
	}

	public void setPrvaKolona(List<String> prvaKolona) {
		if(this.prvaKolona.size()==0 && this.drugaKolona.size()==0)
			this.prvaKolona = prvaKolona;
		else if(prvaKolona.size() == this.drugaKolona.size())
			this.prvaKolona = prvaKolona;
	}

	public List<String> getDrugaKolona() {
		return drugaKolona;
	}

	public void setDrugaKolona(List<String> drugaKolona) {
		if(this.prvaKolona.size()==0 && this.drugaKolona.size()==0)
			this.drugaKolona = drugaKolona;
		else if(drugaKolona.size() == this.prvaKolona.size())
			this.drugaKolona = drugaKolona;	
	}

	public int getBrojPraznihMesta() {
		return brojPraznihMesta;
	}

	public void setBrojPraznihMesta(int brojPraznihMesta) {
		this.brojPraznihMesta = brojPraznihMesta;
	}

}
