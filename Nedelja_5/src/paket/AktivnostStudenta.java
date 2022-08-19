package paket;

public abstract class AktivnostStudenta implements Uslovljeno, Comparable<AktivnostStudenta>{

	private int godina;
	private int mesec;
	private int dan;
	
	public AktivnostStudenta(int godina, int mesec, int dan) {
		super();
		this.godina = godina;
		this.mesec = mesec;
		this.dan = dan;
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}

	public int getMesec() {
		return mesec;
	}

	public void setMesec(int mesec) {
		this.mesec = mesec;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}
	
	public abstract int getGodinaStudija();
	
	@Override
	public int compareTo(AktivnostStudenta obj) {
			if(this.getGodina() < obj.getGodina()) {
				return -1;
			}
			else if(this.getGodina() > obj.getGodina())
				return 1;
			else {
				if(this.getMesec() < obj.getMesec()) {
					return -1;
				}
				else if(this.getMesec() > obj.getMesec())
					return 1;
				else {
					if(this.getDan() < obj.getDan())
						return -1;
					else 
						return 1;
				}
			}
	}
	
}
