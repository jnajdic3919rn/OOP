package paket1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Odsek o = new InformacioneTehnologije("Kompanija1", "IT", 2);
		InformacioneTehnologije o2 = new InformacioneTehnologije("Kompanija2", "IT2", 4);
		//Odsek o3 = new Odsek("It", 3); 
		Programer p1 = new Programer("Jefimija", "Najdic", o, TipProgramera.SoftwareDev);
		Programer p2 = new Programer("Mladen", "Jovanovic", o, TipProgramera.SoftwareDev);
		p1.obracunajBonus(3);
		p1.obracunajPlatu(30, 35.99);
		p2.obracunajPlatu(33, 35.99);
		Finansije f = new Finansije("Kompanija1", "Finansije", 1);
		Ekonomista e = new Ekonomista("Milica", "Mitic", f);
		e.obracunajPlatu(30, 35.99);
		System.out.println("Plata za programera1: " + p1.getPlata() + "; plata za ekonomistu: " + e.getPlata());
		ArrayList<Programer> programeriNaProjektu = new ArrayList<>();
		programeriNaProjektu.add(p1);
		programeriNaProjektu.add(p2);
		Projekat projekat = new Projekat("Novi projekat", "rad na necemu", 100000.00, programeriNaProjektu);
		projekat.dodatniPosao(100.00, p1);
		System.out.println("Plata nakon odradjenog posla: " + p1.getPlata() + " na projektu: " + projekat.getZarada());
		ArrayList<Projekat> projekti = new ArrayList<>();
		projekti.add(projekat);
		f.setPorezNaDobit(10);
		f.izracunajProfitOdProjekata(projekti);
		System.out.println("Profit pre olaksica: " + f.getProfit());
		f.setPoreskeOlaksice(true);
		f.izracunajProfitOdProjekata(projekti);
		System.out.println("Profit nakon olaksica: " + f.getProfit());
	}

}
