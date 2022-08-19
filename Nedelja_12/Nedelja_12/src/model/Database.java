package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Database {

	private static Database instance;
	private List<Placanje> placanja = new ArrayList<>();
	private Set<String> kategorije = new HashSet<>();
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		if(instance == null)
			instance = new Database();
		return instance;
	}
	
	public boolean dodajPlacanje(Placanje placanje) {
		for(Placanje p : placanja) {
			if(p.getDatum().equals(placanje.getDatum()) && p.getUplatPrim().equals(placanje.getUplatPrim()))
				return false;
		}
		placanja.add(placanje);
		return true;
	}
	
	public void dodajKategoriju(String kategorija) {
		kategorije.add(kategorija);
	}

	public List<Placanje> getPlacanja() {
		return placanja;
	}

	public Set<String> getKategorije() {
		return kategorije;
	}
	
}
