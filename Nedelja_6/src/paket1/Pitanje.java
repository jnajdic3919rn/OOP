package paket1;

public abstract class Pitanje implements ZaStampanje, Comparable<Pitanje>{

	private String tekstPitanja;
	private int redniBroj;
	private int brojPoena;
	
	public Pitanje(String tekstPitanja) {
		super();
		this.tekstPitanja = tekstPitanja;
	}

	public Pitanje(String tekstPitanja, int redniBroj) {
		super();
		this.tekstPitanja = tekstPitanja;
		this.redniBroj = redniBroj;
	}

	public String getTekstPitanja() {
		return tekstPitanja;
	}

	public void setTekstPitanja(String tekstPitanja) {
		this.tekstPitanja = tekstPitanja;
	}

	public int getRedniBroj() {
		return redniBroj;
	}

	public void setRedniBroj(int redniBroj) {
		this.redniBroj = redniBroj;
	}

	public int getBrojPoena() {
		return brojPoena;
	}

	public void setBrojPoena(int brojPoena) {
		this.brojPoena = brojPoena;
	}
	
	@Override
	public String vratiZaStampu() {
		return this.toString();
	}
	
	@Override
	public boolean spremanZaStampu() {
		if(this.tekstPitanja != null && !this.tekstPitanja.equals(""))
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return this.redniBroj + ". (" + this.brojPoena + ") " + this.tekstPitanja;
	}
	

	@Override
	public int compareTo(Pitanje o) {
		return this.redniBroj-o.redniBroj;
	}


	
}
