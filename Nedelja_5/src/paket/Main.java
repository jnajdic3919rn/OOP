package paket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("RI", 1, 2019);
		UpisGodine a1 = new UpisGodine(2019, 6, 22);
		a1.setGodinaKojuUpisuje(1);
		UpisGodine a2 = new UpisGodine(2020, 10, 4);
		a2.setGodinaKojuUpisuje(2);
		ObnovaGodine a3 = new ObnovaGodine(2019, 9, 1);
		a3.setGodinaObnove(2);
		if(student.dodajAktivnost(a1))
			System.out.println("Uspesno izvrsena prva aktivnost");
		
		List<Predmet> predmetiPolozeno = new ArrayList<>();
		List<Predmet> prenetiPredmeti = new ArrayList<>();
		Predmet p1 = new Predmet("Matematicka analiza", 8, 2);
		Predmet p2 = new Predmet("UUP", 8, 1);
		Predmet p3 = new Predmet("Dizajn softvera", 8, 3);
		Predmet p4 = new Predmet("ASP", 8, 3);
		Predmet p5 = new Predmet("DAA", 6, 4);
		Predmet p6 = new Predmet("Baze", 8, 4);
		Predmet p7 = new Predmet("Operativni", 9, 4);
		predmetiPolozeno.add(p1);
		predmetiPolozeno.add(p3);
		predmetiPolozeno.add(p4);
		predmetiPolozeno.add(p5);
		prenetiPredmeti.add(p2);
		prenetiPredmeti.add(p6);
		prenetiPredmeti.add(p7);
		student.setPolozeniPredmeti(predmetiPolozeno);
		if(student.dodajAktivnost(a2))
			System.out.println("Uspesno izvrsena druga aktivnost");
		
		for(AktivnostStudenta s:student.getAktivnost()) {
			System.out.println(s.getGodinaStudija());
		}
		
		a2.setPrenetiPredmeti(prenetiPredmeti);
		if(student.slusaPredmet(p1)) {
			System.out.println("Slusa predmet " + p1.getNaziv());
		}
		if(student.jePonovac())
			System.out.println("Ponovac1");

		if(student.dodajAktivnost(a3))
			System.out.println("Uspesno izvrsena treca aktivnost");
		if(student.jePonovac())
			System.out.println("Ponovac2");

		System.out.println("Nakon sorta");
		Collections.sort(student.getAktivnost());
		for(AktivnostStudenta a : student.getAktivnost())
			System.out.println(a.getGodina() + " " + a.getMesec() + " " + a.getDan());
	}

}
