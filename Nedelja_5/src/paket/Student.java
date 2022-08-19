package paket;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String studProgramOznaka;
	private int broj;
	private int godinaUpisa;
	private List<Predmet> polozeniPredmeti;
	private List<AktivnostStudenta> aktivnost = new ArrayList<>();
	
	public Student(String studProgramOznaka, int broj, int godinaUpisa) {
		super();
		this.studProgramOznaka = studProgramOznaka;
		this.broj = broj;
		this.godinaUpisa = godinaUpisa;
	}

	public Student() {
		
	}
	
	public String getStudProgramOznaka() {
		return studProgramOznaka;
	}
	public void setStudProgramOznaka(String studProgramOznaka) {
		this.studProgramOznaka = studProgramOznaka;
	}
	public int getBroj() {
		return broj;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	public int getGodinaUpisa() {
		return godinaUpisa;
	}
	public void setGodinaUpisa(int godinaUpisa) {
		this.godinaUpisa = godinaUpisa;
	}
	
	public List<Predmet> getPolozeniPredmeti() {
		return polozeniPredmeti;
	}

	public void setPolozeniPredmeti(List<Predmet> polozeniPredmeti) {
		this.polozeniPredmeti = polozeniPredmeti;
	}

	public List<AktivnostStudenta> getAktivnost() {
		return aktivnost;
	}

	public void setAktivnost(List<AktivnostStudenta> aktivnost) {
		this.aktivnost = aktivnost;
	}

	public boolean dodajAktivnost(AktivnostStudenta aktivnostStudenta) {
		if(aktivnostStudenta.proveriUslov(this)) {
			this.aktivnost.add(aktivnostStudenta);
			return true;
		}
		return false;
	}
	
	public int vratiGodinuStudija() {
		return this.aktivnost.get(this.aktivnost.size()-1).getGodinaStudija();
	}
	
	public boolean jePonovac() {
		if(this.aktivnost.get(this.aktivnost.size()-1) instanceof ObnovaGodine)
			return true;
		
		return false;
	}
	
	public boolean slusaPredmet(Predmet predmet) {
		if(this.aktivnost.get(this.aktivnost.size()-1) instanceof UpisGodine) {
			int godinaStudija = this.aktivnost.get(this.aktivnost.size()-1).getGodinaStudija();
			if((predmet.getSemestar() == 1 || predmet.getSemestar() == 2) && godinaStudija == 1)
				return true;
			if((predmet.getSemestar() == 3 || predmet.getSemestar() == 4) && godinaStudija == 2)
				return true;
			if((predmet.getSemestar() == 5 || predmet.getSemestar() == 6) && godinaStudija == 3)
				return true;
			if((predmet.getSemestar() == 7 || predmet.getSemestar() == 8) && godinaStudija == 4)
				return true;
			
			UpisGodine u = (UpisGodine) this.aktivnost.get(this.aktivnost.size()-1);
			for(Predmet p:u.getPrenetiPredmeti()) {
				if(p.getNaziv().equals(predmet.getNaziv()))
					return true;
			}
			return false;
		}
		if(this.aktivnost.get(this.aktivnost.size()-1) instanceof ObnovaGodine) {
			ObnovaGodine o = (ObnovaGodine) this.aktivnost.get(this.aktivnost.size()-1);
			for(Predmet p:o.getPredmetiKojeUpisuje()) {
				if(p.getNaziv().equals(predmet.getNaziv()))
					return true;
			}
		}
		return false;
	}
}
