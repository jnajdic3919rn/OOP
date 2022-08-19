package util;

import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import model.Biranje;
import model.Database;
import model.Udzbenik;

public class UcitavanjePodataka {

	public static void ucitajUdzbenike(String nazivFajla) {
		try {
			FileInputStream fis = new FileInputStream(nazivFajla);
			InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader br = new BufferedReader(isr);
			
			String str;
			while((str = br.readLine()) != null) {
				String[] linija = str.split(",");
				List<String> autori = new ArrayList<>();
				int count = 1;
				while(true) {
					if(linija[count].contains("razred"))
						break;
					autori.add(linija[count++]);
				}
				
				Database.getInstance().getUdzbenici().add(new Udzbenik(linija[0], autori, linija[count++], linija[count++], linija[count++], Double.valueOf(linija[count++]), Integer.valueOf(linija[count])));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void ucitajBiranja() {
		boolean postoji;
		for(Udzbenik u : Database.getInstance().getUdzbenici()) {
			postoji = false;
			for(Biranje b : Database.getInstance().getBiranja()) {
				if(u.getRazred().equals(b.getRazred()) && u.getPredmet().equals(b.getPredmet())) {
					b.setBroj(b.getBroj() + 1);
					postoji = true;
					break;
				}
			}
			if(!postoji)
				Database.getInstance().getBiranja().add(new Biranje(u.getRazred(), u.getPredmet(), 1));
		}
	}
}
