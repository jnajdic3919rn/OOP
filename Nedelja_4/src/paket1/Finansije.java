package paket1;

import java.util.ArrayList;

public class Finansije extends Odsek{

	private double profit;
	private int porezNaDobit;
	private boolean poreskeOlaksice;
	
	public Finansije(String kompanija, String naziv, int brojZaposljenih) {
		super(kompanija, naziv, brojZaposljenih);
		// TODO Auto-generated constructor stub
	}

	public int getPorezNaDobit() {
		return porezNaDobit;
	}

	public void setPorezNaDobit(int porezNaDobit) {
		this.porezNaDobit = porezNaDobit;
	}

	public boolean isPoreskeOlaksice() {
		return poreskeOlaksice;
	}

	public void setPoreskeOlaksice(boolean poreskeOlaksice) {
		this.poreskeOlaksice = poreskeOlaksice;
	}

	public double getProfit() {
		return profit;
	}

	public void izracunajProfitOdProjekata(ArrayList<Projekat> projekti) {
		this.profit = 0;
		for(Projekat p:projekti) {
			if(this.poreskeOlaksice == true)
				this.profit += p.getZarada()*(100-porezNaDobit+3)/100;
			else {
				this.profit += p.getZarada()*(100-porezNaDobit)/100;
			}
		}
	
	}
	

}
