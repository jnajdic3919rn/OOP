package util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;

import model.Database;
import model.Placanje;
import model.Tip;

public class UcitavanjePodataka {

	public static void ucitajPlacanja(String nazivFajla) {
		try {
			FileInputStream fis = new FileInputStream(nazivFajla);
			InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader br = new BufferedReader(isr);
			
			String str;
			
			while((str = br.readLine()) != null) {
				String[] linija = str.split(";");
				if(linija.length > 3) {
					Placanje p = new Placanje(Integer.valueOf(linija[0]), linija[1], linija[2], linija[3], Tip.ISPLATA);
					Placanje.setStanje(Placanje.getStanje() - p.getIznos());
					Database.getInstance().dodajPlacanje(p);
					Database.getInstance().dodajKategoriju(linija[3]);
					
				}
				else {
					Placanje p = new Placanje(Integer.valueOf(linija[0]), linija[1], linija[2], Tip.UPLATA);
					Placanje.setStanje(Placanje.getStanje() + p.getIznos());
					Database.getInstance().dodajPlacanje(p);
				}
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
