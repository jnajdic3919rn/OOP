package paket1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Prvi print u main-u u paketu 1");
		Scanner sc = new Scanner(System.in);

		int broj = sc.nextInt(); /// ucitava ceo broj sa konzole
		
		/// Rad sa stringovima
		
		String str = "broj";
		
		/**
		 * Konkatenacija (spajanje) stringova
		 * koristeci concat() metodu ili + operator
		 */
		
		/// konkatenacija stringova koristeci funkciju concat() koja kao argument prima string
		str = str.concat("67"); /// na string "broj" dodaje se string "67", pa ce str biti "broj67"
		
		System.out.println(str);
		System.out.println(str + broj); /// ispisuje se string str i na njega konkateniran ucitan broj koji se konvertuje u string  
		
		str = str + broj + broj;
		/// str = str + (broj + broj);
		System.out.println(str);
		
		int broj1 = 100, broj2 = 340, zbir;
		zbir = broj1 + broj2;
		System.out.println("Zbir: " + zbir);
		
		/**
		 * mala digresija na nizove
		 * deklaracija i inicijalizacija niza, ucitavanje elemenata u niz i ispis niza
		 */
		
		int[] niz = new int[10]; /// ili int niz[] = new int[10];
		
		for(int i = 0; i<niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		
		/** Ispis sa obicnom for petljom
		for(int i = 0; i<niz.length; i++) {
			System.out.println(niz[i]);
		}
		*/
		
		/// Ispis koriscenjem for each petlje
		for(int element:niz) {
			System.out.println(element);
		}
		
		/**
		 * Razdvajanje stringova po necemu
		 * koristeci split() metodu
		 */
		
		String str2 = "Danas je prvi cas";
		String podstringovi[] = str2.split(" ");
		
		/**
		 * podstringovi[0] = "Danas"
		 * podstringovi[1] = "je"
		 * podstringovi[2] = "prvi"
		 * podstringovi[3] = "cas"
		 */
		
		for(String s : podstringovi) {
			System.out.println(s);
		}
		
		System.out.println("Originalan string: " + str2);
		
		/**
		 * Jos neke metode za stringove
		 * replace(), toUpperCase(), toLowerCase()
		 */
		
		/// str2 = str2.replace('a', 'l');
		str2 = str2.toUpperCase();
		System.out.println(str2);
		str2 = str2.toLowerCase();
		System.out.println(str2);
		
		sc.close();
		
		/**
		 * Ucitavanje iz fajla
		 */
		System.out.println("Ucitavamo fajl kreatora: " + args[1]);
		
		File fajl = new File(args[0]);
		try {
			Scanner scFile = new Scanner(fajl);
			while(scFile.hasNext()) {
				String linija = scFile.nextLine();
				System.out.println(linija);
			}
			scFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("Dati fajl nije pronadjen");
		}
		
		/**
		 * Ispis argumenata komandne linija
		 * (dodavanje argumenata: desni klik na Main klasu u Package Explorer-u,
		 * klik na Run As -> Run Configurations...
		 * U novom prozoru u Arguments uneti argumente sa razmakom, i klik na Apply)
		 */
		
		for(String argument : args) {
			System.out.println(argument);
		}
		
		
		
	}

}
