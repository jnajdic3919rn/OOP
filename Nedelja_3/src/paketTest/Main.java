package paketTest;

import java.io.File;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String klijenti[] = new String[10];

        String ime = "N";
        String prezime = "N";
        String korisnickoIme = "N";
        String sifra = "N";
        double stanje = 0.0;

        File fajl = new File("fajl");
        int i = 0;
        try {
            Scanner sc = new Scanner(fajl);
            while(sc.hasNext()){
                klijenti[i] = sc.nextLine();
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int j = i; j<klijenti.length; j++){
            klijenti[j] = "N;N;N;N;0.0";
        }
//        for(String e: klijenti){
//            System.out.println(e);
//        }


        boolean izlaz = true;

        int opcija;
        Scanner sc1 = new Scanner(System.in);

        while(izlaz){
            System.out.println("Izaberite opciju:\n1.Prijavi se\n2.Ispis podataka\n3.Podigni novac\n4.Uplati novac\n5.Odjavi se\n6.Izlaz iz programa\n7.Kreiraj nalog");
            opcija = sc1.nextInt();
            sc1.nextLine();
            switch(opcija){
                case 1:
                    if(korisnickoIme.equals("N")){
                        System.out.println("Unesite korisnicko ime, pa lozinku");
                        String unetoKorisnicko;
                        String unetaSifra;
                        unetoKorisnicko = sc1.nextLine();
                        unetaSifra = sc1.nextLine();
                        int brojac = 0;
                        for(String klijent: klijenti){
                            String spliter[] = klijent.split(";");
                            String korisnickoIme1 = spliter[2];
                            String sifra1 = spliter[3];
                            if(korisnickoIme1.equals(unetoKorisnicko) && sifra1.equals(unetaSifra)){
                                ime = spliter[0];
                                prezime = spliter[1];
                                korisnickoIme = korisnickoIme1;
                                sifra = sifra1;
                                stanje = Double.valueOf(spliter[4]);
                                System.out.println("Uspesno ste se prijavili");
                                break;
                            }
                            else{
                                brojac++;
                            }

                        }
                        if(brojac == klijenti.length){
                            System.out.println("Neuspesna prijava! Uneli ste pogresno korisnicko ime ili loziku");
                        }
                        brojac = 0;
                    }
                    else{
                        System.out.println("Klijent je vec prijavljen");
                    }

                    break;
                case 2:
                    if(korisnickoIme.equals("N")){
                        System.out.println("Korisnik nije prijavljen");
                    }
                    else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Postovani/a ");
                        sb.append(ime + " ");
                        sb.append(prezime);
                        sb.append(", imate raspolozivo ");
                        sb.append(stanje + " ");
                        sb.append("dinara na racunu");
                        System.out.println(sb.toString());
                    }
                    break;
                case 3:
                    if(korisnickoIme.equals("N")){
                        System.out.println("Morate se prethodno prijavili da biste mogli da podignete novac sa racuna");
                    }
                    else{
                        System.out.println("Unesite iznos koji zelite da podignete");
                        double iznos;
                        //sc1.nextLine();
                        iznos = sc1.nextDouble();
                        //sc1.nextLine();
                        if(stanje < iznos){
                            System.out.println("Nemate dovoljno novca");
                        }
                        else{
                            stanje -= iznos;
                            System.out.println("Uspesno ste podgili " + iznos + " dinara");
                            System.out.println("Novo stanje na racunu: " + stanje);
                        }
                    }
                    break;
                case 4:
                    if(korisnickoIme.equals("N")){
                        System.out.println("Morate se prethodno prijaviti da biste mogli da uplatite novac na racun");
                    }
                    else{
                        System.out.println("Unesite iznos koji zelite da uplatite");
                        double iznos = sc1.nextDouble();
                        stanje += iznos;
                        System.out.println("Novo stanje na racunu: " + stanje);
                    }
                    break;
                case 5:
                    ime = "N";
                    prezime = "N";
                    korisnickoIme = "N";
                    sifra = "N";
                    stanje = 0.0;
                    break;
                case 6:
                    izlaz = false;
                    sc1.close();
                    break;
                case 7:
                    if(korisnickoIme.equals("N")) {
                        if (i < 10) {
                            System.out.println("Unesite ime, prezime, korisnicko ime i lozinku u sledecem formatu:\nime:prezime:korisnickoIme:lozinku");
                            String novi = sc1.nextLine();
                            String klijent[] = novi.split(":");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(klijent[0]);
                            sb2.append(";");
                            sb2.append(klijent[1]);
                            sb2.append(";");
                            sb2.append(klijent[2]);
                            sb2.append(";");
                            sb2.append(klijent[3]);
                            sb2.append(";");
                            sb2.append(0.0);
                            klijenti[i] = sb2.toString();
                            i++;
                        } else {
                            System.out.println("Dostignut je limit broja korisnika");
                        }
                    }
                    else
                        System.out.println("Ne mozete napraviti nalog dok ste prijavljeni na vec postojecem nalogu");
                    break;
            }
        }
    }

}
