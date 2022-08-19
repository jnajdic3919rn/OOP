package util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import model.Database;
import model.Student;
import model.Ucionica;

public class UcitavanjePodataka {

	public static void ucitajStudente(String nazivFajla) {
		try {
			FileInputStream fis = new FileInputStream(nazivFajla);
			InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader br = new BufferedReader(isr);
			
			String str;
			while((str = br.readLine()) != null) {
				String linija[] = str.split(",");
				Database.getInstance().dodajStudenta(new Student(linija[4], linija[3], Integer.valueOf(linija[2]), Integer.valueOf(linija[1]), linija[0]));
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void ucitajUcionice(String nazivFajla) {
		try {
			FileInputStream fis = new FileInputStream(nazivFajla);
			InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader br = new BufferedReader(isr);
			
			String str;
			while((str = br.readLine()) != null) {
				if(str.contains("-")) {
					String linija[] = str.split("-");
					Database.getInstance().dodajUcionicu(new Ucionica(linija[0], linija[1]));
				}
				else
					Database.getInstance().dodajUcionicu(new Ucionica(str, "N"));
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
