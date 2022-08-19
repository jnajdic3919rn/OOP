package paket1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Stamparija {

	private List<ZaStampanje> zaStampanje = new ArrayList<>();

	public List<ZaStampanje> getZaStampanje() {
		return zaStampanje;
	}

	public void setZaStampanje(List<ZaStampanje> zaStampanje) {
		this.zaStampanje = zaStampanje;
	}

	public void dodajZaStampanje(ZaStampanje zaStampanje) {
		this.zaStampanje.add(zaStampanje);
	}
	
	public void odstampajOdDo(int od, int dO) {
		String zaStampu = "";
		for(int i = od; i<dO; i++) {
			zaStampu += this.zaStampanje.get(i).vratiZaStampu() + "\n";
			if(!this.zaStampanje.get(i).spremanZaStampu()) {
				System.out.println("Nije spremno");
				return;
			}
		}
		System.out.println(zaStampu);
	}
	
	public void odstampajOdDo(int od, int dO, String nazivFajla) {
		String zaStampu = "";
		for(int i = od; i<dO; i++) {
			zaStampu += this.zaStampanje.get(i).vratiZaStampu() + "\n";
			if(!this.zaStampanje.get(i).spremanZaStampu()) {
				System.out.println("Nije spremno");
				return;
			}
		}
		File fajl = new File(nazivFajla);
		try {
			FileWriter writeToFile = new FileWriter(fajl);
			writeToFile.write(zaStampu);
			writeToFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
