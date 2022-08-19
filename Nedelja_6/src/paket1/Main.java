package paket1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Stamparija stamparija = new Stamparija();
		List<ZaStampanje> zaStampanje1 = new ArrayList<ZaStampanje>();
		List<ZaStampanje> zaStampanje2 = new ArrayList<ZaStampanje>();
		List<Pitanje> zaStampanjeUspeh = new ArrayList<Pitanje>();
		List<Pitanje> zaStampanjeNeuspeh = new ArrayList<Pitanje>();
		PitanjePonudjeniOdgovori p1 = new PitanjePonudjeniOdgovori("Pitanje ponudjeni odgovori 1", 1);
		PitanjePonudjeniOdgovori p2 = new PitanjePonudjeniOdgovori("Pitanje ponudjeni odgovori 2", 1);
		
		p1.getPonudjeniOdgovori().add("Odgovor 1");
		p1.getPonudjeniOdgovori().add("Odgovor 2");
		
		p2.getPonudjeniOdgovori().add("Odgovor 3");
		
		PitanjePovezivanje p3 = new PitanjePovezivanje("Pitanje povezivanje 1", 2);
		PitanjePovezivanje p4 = new PitanjePovezivanje("Pitanje povezivanje 2", 2);
		List<String> kol1 = new ArrayList<String>();
		List<String> kol2 = new ArrayList<String>();
		kol1.add("OOP");
		kol1.add("UUP");
		kol2.add("Dragan Urosevic");
		kol2.add("Bojana Dimic");
		p3.setPrvaKolona(kol1);
		p3.setDrugaKolona(kol2);
		p3.setBrojPraznihMesta(3);
		
		List<String> kol11 = new ArrayList<String>();
		List<String> kol22 = new ArrayList<String>();
		kol11.add("OOP");
		kol11.add("UUP");
		kol22.add("Dragan Urosevic");
		kol22.add("Bojana Dimic");
		p4.setPrvaKolona(kol11);
		p4.setDrugaKolona(kol22);
		p4.getPrvaKolona().add("ORS");
		
		PitanjeSlobodanOdgovor p5 = new PitanjeSlobodanOdgovor("Pitanje slobodan odgovor 1", 3);
		PitanjeSlobodanOdgovor p6 = new PitanjeSlobodanOdgovor("Pitanje slobodan odgovor 2", 3);
		
		/// dodato
		PopunjavanjePraznihMesta p7 = new PopunjavanjePraznihMesta("Pitanje popuni mesto 1", 4);
		p7.getPozicija().add(1);
		p7.getPozicija().add(3);
		p7.setBrojPoena(4);
		p7.setBrojDonjihCrtica(5);
		
		
		p5.setBrojLinija(4);
		p6.setBrojLinija(0);
		zaStampanjeUspeh.add(p1);
		zaStampanjeUspeh.add(p3);
		zaStampanjeUspeh.add(p5);
		zaStampanjeUspeh.add(p7);
		
		zaStampanjeNeuspeh.add(p2);
		zaStampanjeNeuspeh.add(p4);
		zaStampanjeNeuspeh.add(p6);
		
		Test t1 = new Test();
		Test t2 = new Test();
		t1.setPitanja(zaStampanjeUspeh);
		t1.setNaslov("Naslov testa");
		t2.setPitanja(zaStampanjeNeuspeh);
		
		zaStampanje1.add(p6);
		///zaStampanje1.add(p2);
		zaStampanje1.add(p1);
		zaStampanje1.add(p3);
		zaStampanje1.add(p7);
		zaStampanje1.add(p5);
		zaStampanje1.add(t1);
		zaStampanje1.add(t2);
		p1.setBrojPoena(10);
		p3.setBrojPoena(5);
		p5.setBrojPoena(3);
		stamparija.setZaStampanje(zaStampanje1);
		stamparija.odstampajOdDo(2, 6);
		stamparija.odstampajOdDo(2, 6, "stampanje");
		
	}

}
