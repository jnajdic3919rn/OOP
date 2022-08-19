package paket1;

import java.util.ArrayList;

public class InformacioneTehnologije extends Odsek {
	
	private ArrayList<Projekat> projekti;

	public InformacioneTehnologije(String kompanija, String naziv, int brojZaposljenih) {
		super(kompanija, naziv, brojZaposljenih);
		this.projekti = new ArrayList<>();
	}

	public InformacioneTehnologije(String kompanija, String naziv, int brojZaposljenih, ArrayList<Projekat> projekti) {
		super(kompanija, naziv, brojZaposljenih);
		this.projekti = projekti;
	}
	
	public void dodajProjekat(Projekat p) {
		this.projekti.add(p);
	}

}
