package paket1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		String klijenti[] = new String[10];
		
		String ime = "NO";
		String prezime = "NO";
		String korisnickoIme = "NO";
		String lozinka = "NO";
		double stanje = 0.0;
	
		int i = 0;
		File fajl = new File("klijenti");
		try {
			Scanner sc = new Scanner(fajl);
			while(sc.hasNext()) {
				klijenti[i++] = sc.nextLine();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int j = i; j<klijenti.length; j++) {
			klijenti[j] = "NO;NO;NO;NO;0.0";
		}
		
		boolean flag = true;
		
		int opcija;
		Scanner scIn = new Scanner(System.in);
		
		while(flag) {
			System.out.println("Izaberite opciju:\n1.Prijavi se\n2.Prikazi sve podatke.\n3.Podigni novac.\n4.Uplati novac.\n5.Odjavi se\n6.Izlaz iz programa.\n7.Kreiraj nalog.");
			opcija = scIn.nextInt();
			scIn.nextLine();
			switch(opcija) {
				case 1:
					if(!korisnickoIme.equals("NO"))
						System.out.println("Korisnik je vec prijavljen!");
					else {
						System.out.println("Unesite korisnicko ime, pa lozinku");
						String unetoKorisnickoIme = scIn.nextLine();
						String unetaLozinka = scIn.nextLine();
						for(String klijent : klijenti) {
							String k[] = klijent.split(";");
							String kKorisnickoIme = k[2];
							String kLozinka = k[3];
							if(kKorisnickoIme.equals(unetoKorisnickoIme)) {
								if(kLozinka.equals(unetaLozinka)) {
									korisnickoIme = kKorisnickoIme;
									lozinka = kLozinka;
									ime = k[0];
									prezime = k[1];
									stanje = Double.valueOf(k[4]);
									System.out.println("Uspesno ste se prijavili!");
									break;
								}
								else {
									System.out.println("Neuspesna prijava! Uneli ste pogresnu lozinu!");
									break;
								}	
							}
							}
							if(ime.equals("NO"))
								System.out.println("Uneli ste pogresne kredencijale!");
						}
					break;
				case 2:
					if(ime.equals("NO"))
						System.out.println("Korisnik nije prijavljen!");
					else {
						StringBuilder sb = new StringBuilder();
						sb.append("Postovani/a ");
						sb.append(ime);
						sb.append(" ");
						sb.append(prezime);
						sb.append(", imate raspolozivo ");
						sb.append(stanje);
						sb.append(" dinara na racunu");
						System.out.println(sb.toString());
					}
					//System.out.println("Postovani/a " + ime + " " + prezime + ; + stanje + " dinara na racunu");
					break;
				case 3:
					System.out.println("Unesite iznos koji zelite podici:");
					double iznos = scIn.nextDouble();
					if(stanje < iznos)
						System.out.println("Neuspesno! Nemate dovoljno na racunu.");
					else {
						stanje -= iznos;
						System.out.println("Novo stanje na racunu: " + stanje);
					}
					
					break;
				case 4:
					System.out.println("Unesite iznos za uplatu:");
					double zaUplatu = scIn.nextDouble();
					stanje += zaUplatu;
					System.out.println("Novo stanje na racunu: " + stanje);
					break;
				case 5:
					korisnickoIme = "NO";
					lozinka = "NO";
					ime = "NO";
					prezime = "NO";
					stanje = 0.0;
					break;
				case 6:
					flag = false;
					break;
				case 7:
					if(i < 10) {
						System.out.println("Unesite ime:prezime:korisnickoIme:lozinku");
						String str[] = scIn.nextLine().split(":");
						StringBuilder sbCreate = new StringBuilder();
						sbCreate.append(str[0]);
						sbCreate.append(";");
						sbCreate.append(str[1]);
						sbCreate.append(";");
						sbCreate.append(str[2]);
						sbCreate.append(";");
						sbCreate.append(str[3]);
						sbCreate.append(";");
						sbCreate.append(0.0);
						klijenti[i++] = sbCreate.toString();
					}
					else
						System.out.println("Dostignut limit u broju user-a");
					break;
			}
		}
		
	}

}
