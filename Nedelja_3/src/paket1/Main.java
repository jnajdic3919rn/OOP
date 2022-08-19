package paket1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		/// LinkedList<> lista1 = new LinkedList<>();
		
		///ArrayList lista = new ArrayList();
		ArrayList<String> predmeti = new ArrayList<String>();
		
		predmeti.add("Poslovne aplikacije");
		predmeti.add("Usmeno izrazavanje");
		predmeti.add("ORS");
		
		for(String predmet:predmeti) {
			System.out.println(predmet);
		}
		
		/// Posle umetanja elementa na poziciji 1
		predmeti.add(1, "Engleski");
		System.out.println("Posle umetanja predmeta na poziciji 1:");
		
		for(String predmet:predmeti) {
			System.out.println(predmet);
		}
		
		/// Posle menjanja elementa na poziciji 2
		predmeti.set(2,  "Usmeno i pismeno izrazavanje");
		System.out.println("Posle menjanja predmeta na poziciji 2:");
		
		for(String predmet:predmeti) {
			System.out.println(predmet);
		}
		
		/// Posle uklanjanja elementa na poziciji 1
		predmeti.remove(1);
		System.out.println("Posle uklanjanja elementa na poziciji 1:");
		
		for(String predmet:predmeti) {
			System.out.println(predmet);
		}
		
		/// Brisanje svih elemenata u listi
		/**
		predmeti.clear();
		System.out.println("Posle uklanjanja svih elementa:");
		
		for(String predmet:predmeti) {
			System.out.println(predmet);
		}
		*/
		
		/// Dodavanje cele liste u nasu listu predmeti
		
		ArrayList<String> predmetiMata = new ArrayList<>();
		predmetiMata.add("Linearna algebra");
		predmetiMata.add("Diskretne strukture");
		predmetiMata.add("Matematicka analiza");
		
		predmeti.addAll(predmetiMata);
		System.out.println("Nakon dodavanja liste predmetiMata:");
		
		for(String predmet:predmeti) {
			System.out.println(predmet);
		}
		
		ArrayList<String> predmetiProgramiranje = new ArrayList<>();
		predmetiProgramiranje.add("Uvod u prograiranje");
		predmetiProgramiranje.add("Objektno-orjentisno programiranje");
		
		predmeti.addAll(1, predmetiProgramiranje);
		System.out.println("Nakon dodavanja liste predmetiProgramiranje na poziciji 1:");
		
		for(String predmet:predmeti) {
			System.out.println(predmet);
		}
		
		Predmet p1 = new Predmet("OOP", "Bojana Dimic Surla", 8);
		System.out.println(p1.getNaziv() + " predaje " + p1.getPredavac());
		p1.dodajSifru("1111");
		for(String sifra:p1.getSifraPredmeta()) {
			System.out.println(sifra);
		}
		
		ArrayList<String> sifreOOP = new ArrayList<>();
		sifreOOP.add("1234");
		sifreOOP.add("1234a");
		sifreOOP.add("1234b");
		p1.setSifraPredmeta(sifreOOP);
		
		for(String sifra:p1.getSifraPredmeta()) {
			System.out.println(sifra);
		}
		
		Predmet p2 = new Predmet("UUP", "Dragan Urosevic", 8);
		p2.dodajSifru("0003");
		ArrayList<Predmet> predmetiO = new ArrayList<>();
		predmetiO.add(p1);
		predmetiO.add(p2);
		
		for(Predmet predmet:predmetiO) {
			System.out.println(predmet.getNaziv() + " predaje " + predmet.getPredavac());
		}
		
	}

}
