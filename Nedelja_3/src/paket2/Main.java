package paket2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Banka> banke = new ArrayList<Banka>();
		Banka b1 = new Banka("Banka Intesa", "Beograd");
		Banka b2 = new Banka("Rajfajzen", "Beograd");
		banke.add(b1);
		banke.add(b2);
		
		Klijent k1 = new Klijent("Jefimija", "Najdic", 21, "jnajdic123", "sifra123");
		Klijent k2 = new Klijent("Mladen", "Jovanovi", 21, "mjovanovic37", "sifra37");
		Klijent k3 = new Klijent("Mihajlo", "Stojanovic", 21, "mstojanvic61", "sifra61");
		
		b1.dodajKlijenta(k1);
		b1.dodajKlijenta(k2);
		b2.dodajKlijenta(k3);
		
		Racun r1 = new Racun("123", b1);
		r1.setStanje(54000);
		
		Racun r2 = new Racun("37", b1);
		r2.setStanje(70000);
		
		Racun r3 = new Racun("61", b2);
		k1.setRacun(r1);
		
		System.out.println("Unos korisnicko ime i lozinka:");
		Scanner sc = new Scanner(System.in);
		String kI = sc.nextLine();
		String l = sc.nextLine();
		
		Klijent prijavljeni = null;
		
		for(Banka b:banke) {
			for(Klijent k:b.getKlijenti()) {
				if(k.getKorisnickoIme().equals(kI) && k.getLozinka().equals(l)) {
					System.out.println("Uspesna prijava!");
					prijavljeni = k;
					break;
				}
			}
		}
		
		Racun r = prijavljeni.getRacun();
		System.out.println("Trenutno stanje: " + r.getStanje());
		if(r.podigniNovac(20000))
			System.out.println("Uspesna transakcija!");
		else 
			System.out.println("Neuspesna transakcija!");
		
		System.out.println("Novo stanje: " + r.getStanje());
		
		r.uplatiNovac(2000);
		
		System.out.println("Novo stanje: " + r.getStanje());
		
		for(Transakcija t:r.getTransakcije()) {
			System.out.println("Izvrseno: " + t.getTip() + " u " + t.getVreme());
		}
	}

}
