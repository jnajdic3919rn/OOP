package paket;

import java.util.List;

public class UpisGodine extends AktivnostStudenta {

	private int godinaKojuUpisuje;
	private List<Predmet> prenetiPredmeti;
	
	public UpisGodine(int godina, int mesec, int dan) {
		super(godina, mesec, dan);
	}

	public int getGodinaKojuUpisuje() {
		return godinaKojuUpisuje;
	}

	public void setGodinaKojuUpisuje(int godinaKojuUpisuje) {
		this.godinaKojuUpisuje = godinaKojuUpisuje;
	}
	
	public List<Predmet> getPrenetiPredmeti() {
		return prenetiPredmeti;
	}

	public void setPrenetiPredmeti(List<Predmet> prenetiPredmeti) {
		this.prenetiPredmeti = prenetiPredmeti;
	}

	public int getGodinaStudija() {
		return this.godinaKojuUpisuje;
	}
	
	public boolean proveriUslov(Student student) {
		if(this.godinaKojuUpisuje == 1)
			return true;
		int espb = 0;
		for(Predmet predmet:student.getPolozeniPredmeti()) {
			espb += predmet.getEspb();
		}
		boolean uslov = false;
		for(AktivnostStudenta aktivnost:student.getAktivnost()) {
			if(aktivnost instanceof UpisGodine) {
				if(((UpisGodine) aktivnost).godinaKojuUpisuje == this.godinaKojuUpisuje-1) {
					uslov = true;
					break;
				}
				if(aktivnost instanceof ObnovaGodine) {
					if(((ObnovaGodine) aktivnost).getGodinaObnove() == this.godinaKojuUpisuje-1) {
						uslov = true;
						break;
					}
				}
			}
		}
		if(this.godinaKojuUpisuje == 2 && espb >= 30 && uslov) 
			return true;
		if(this.godinaKojuUpisuje == 3 && espb >= 90 && uslov)
			return true;	
		if(this.godinaKojuUpisuje == 4 && espb >= 150 && uslov)
			return true;
			
		return false;
	}
/*
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof UpisGodine) {
			if(((UpisGodine) obj).getGodina() < this.getGodina()) {
				return 1;
			}
			else if(((UpisGodine) obj).getGodina() > this.getGodina())
				return -1;
			else {
				if(((UpisGodine) obj).getMesec() < this.getMesec()) {
					return 1;
				}
				else if(((UpisGodine) obj).getMesec() > this.getMesec())
					return -1;
				else {
					if(((UpisGodine) obj).getGodina() < this.getGodina())
						return 1;
					else 
						return -1;
				}
			}
		}
		return 0;
	}
*/
	
}
