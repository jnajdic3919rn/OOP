package paket1;

import java.util.ArrayList;

public class Projekat {

	private String naziv;
	private String opis;
	private double zarada;
	private ArrayList<Programer> programeri;
	
	public Projekat(String naziv, String opis, double zarada) {
		super();
		this.naziv = naziv;
		this.opis = opis;
		this.zarada = zarada;
		this.programeri = new ArrayList<>();
	}
	
	public Projekat(String naziv, String opis, double zarada, ArrayList<Programer> programeri) {
		super();
		this.naziv = naziv;
		this.opis = opis;
		this.zarada = zarada;
		this.programeri = programeri;
	}

	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public ArrayList<Programer> getProgrameri() {
		return programeri;
	}
	public void setProgrameri(ArrayList<Programer> programeri) {
		this.programeri = programeri;
	}
	
	public double getZarada() {
		return zarada;
	}

	public void dodajProgrameraNaProjektu(Programer p) {
		this.programeri.add(p);
	}
	
	public void dodatniPosao(double cena, Programer p) {
		double zaFirmu = (cena*80)/100;
		double zaProgramera = cena - zaFirmu;
		this.zarada += zaFirmu;
		System.out.println("Za firmu " + zaFirmu + " za programera " + zaProgramera);
		for(Programer prog:this.programeri) {
			if(prog.getIme().equals(p.getIme()) && prog.getPrezime().equals(p.getPrezime())) {
				prog.dodajExtraOdProjekta(zaProgramera);
			}
		}
	}
	
}
