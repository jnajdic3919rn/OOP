package paket;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Racun racun = new Racun("12345", 30000.0, "banka1");
		Klijent k = new Klijent("Pera", "Peric", racun);
		
		String nazivFajla = "klijent.txt";
		
		/// Serijalizacija
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream(nazivFajla);
			oos = new ObjectOutputStream(fos);
		
			/// Metoda za serijalizaciju za upisivanje objekta
			oos.writeObject(k);
			
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/// Deserijalizacija
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(nazivFajla);
			ois = new ObjectInputStream(fis);
			
			/// Metoda za deserijalizaciju citanje objekta
			k = (Klijent) ois.readObject();
			System.out.println(k);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Nisam naso fajl ex");
			///e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			// System.out.println("Nisam naso fajl io ex");
			e.printStackTrace();
		}  catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				ois.close();
			} catch(NullPointerException | IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("U finally nakon null");
		}
		Scanner sc = new Scanner(System.in);
		double suma = sc.nextDouble();
		try {
			podigniNovac(k.getRacun().getRaspolozivo(), suma);
		} catch (MaxSumaPodizanjeEx e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(LimitPodizanjaNovcaEx e) {
			e.printStackTrace();
		}
		System.out.println("nakon podizanja novca!");
		sc.close();
	}

	private static void podigniNovac(double raspolozivo, double suma) throws MaxSumaPodizanjeEx {
		if(suma > 40000)
			throw new MaxSumaPodizanjeEx("Ne mozete podici odjednom preko 40000!");
		if(raspolozivo < suma)
			throw new LimitPodizanjaNovcaEx("Nemate toliko para na racunu!");
		else
			System.out.println("Uspesno podignuta gotovina!");
	}
}
