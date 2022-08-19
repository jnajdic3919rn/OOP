package paket1;

public class Programer extends Zaposljen{

	private TipProgramera tip;
	private double bonus;
	
	public Programer(String ime, String prezime, Odsek odsek, TipProgramera tip) {
		super(ime, prezime, odsek);
		this.tip = tip;
	}

	public TipProgramera getTip() {
		return tip;
	}

	public void setTip(TipProgramera tip) {
		this.tip = tip;
	}

	public double getBonus() {
		return bonus;
	}

	private double nadjiCenaPoSatu() {
		if(tip.equals(TipProgramera.SoftwareDev))
			return 55.99;
		else if(tip.equals(TipProgramera.WebDev))
			return 48.99;
		else
			return 40.99;
	}
	
	public void obracunajBonus(int brojPrekovremenihSati) {
		this.bonus = brojPrekovremenihSati*nadjiCenaPoSatu();
	}
	
	public void dodajExtraOdProjekta(double suma) {
		/// this.bonus += suma;
		this.setPlata(getPlata() + suma);
	}
	
	@Override
	public void obracunajPlatu(int brojSati, double cenaPoSatu) {
		this.setPlata(brojSati*cenaPoSatu + bonus);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Programer) {
			if(((Programer) obj).getIme().equals(this.getIme()))
				return true;
		}
		return false;
	}
	
	
	
}
