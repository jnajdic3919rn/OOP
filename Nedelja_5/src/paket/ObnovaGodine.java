package paket;

import java.util.List;

public class ObnovaGodine extends AktivnostStudenta{

	private int godinaObnove;
	private List<Predmet> predmetiKojeUpisuje;
	
	public ObnovaGodine(int godina, int mesec, int dan) {
		super(godina, mesec, dan);
	}

	public int getGodinaObnove() {
		return godinaObnove;
	}

	public void setGodinaObnove(int godinaObnove) {
		this.godinaObnove = godinaObnove;
	}

	public List<Predmet> getPredmetiKojeUpisuje() {
		return predmetiKojeUpisuje;
	}

	public void setPredmetiKojeUpisuje(List<Predmet> predmetiKojeUpisuje) {
		this.predmetiKojeUpisuje = predmetiKojeUpisuje;
	}
	
	public int getGodinaStudija() {
		return this.godinaObnove;
	}
	
	public boolean proveriUslov(Student student) {
		for(AktivnostStudenta aktivnost:student.getAktivnost()) {
			if(aktivnost instanceof UpisGodine) {
				if(((UpisGodine) aktivnost).getGodinaKojuUpisuje() == this.godinaObnove)
					return true;
			}
			if(aktivnost instanceof ObnovaGodine) {
				if(((ObnovaGodine) aktivnost).getGodinaObnove() == this.godinaObnove)
					return true;
			}
		}
		return false;
	}
/*
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof ObnovaGodine) {
			if(((ObnovaGodine) obj).getGodina() < this.getGodina()) {
				return 1;
			}
			else if(((ObnovaGodine) obj).getGodina() > this.getGodina())
				return -1;
			else {
				if(((ObnovaGodine) obj).getMesec() < this.getMesec()) {
					return 1;
				}
				else if(((ObnovaGodine) obj).getMesec() > this.getMesec())
					return -1;
				else {
					if(((ObnovaGodine) obj).getGodina() < this.getGodina())
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
