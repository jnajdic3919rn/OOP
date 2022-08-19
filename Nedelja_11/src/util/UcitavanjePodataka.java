package util;

import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
				String[] linijaSplitovano = str.split(",");
				String ime = linijaSplitovano[4];
				String prezime = linijaSplitovano[3];
				String index = linijaSplitovano[1] + "/" + linijaSplitovano[0] + "-" + linijaSplitovano[2];
				Database.getInstance().dodajStudenta(new Student(ime, prezime, index));
			}
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
				if(str.contains("-"))
					Database.getInstance().dodajUcionicu(new Ucionica(str.split("-")[0], str.split("-")[1]));
				else
					Database.getInstance().dodajUcionicu(new Ucionica(str, "N"));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
