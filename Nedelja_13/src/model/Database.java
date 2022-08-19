package model;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private static Database instance = null;
	private List<Udzbenik> udzbenici = new ArrayList<>();
	private List<Biranje> biranja = new ArrayList<>();
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		if(instance == null)
			instance = new Database();
		return instance;
	}

	public List<Udzbenik> getUdzbenici() {
		return udzbenici;
	}

	public List<Biranje> getBiranja() {
		return biranja;
	}
	
}
