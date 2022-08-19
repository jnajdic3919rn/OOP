package model;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private static Database instance = null;
	
	private List<Student> studenti = new ArrayList<>();
	private List<Ucionica> ucionice = new ArrayList<>();
	private List<UcionicaObl> ucionicePoTerminima = new ArrayList<>();
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		if(instance == null)
			instance = new Database();
		return instance;
	}
	
	public boolean dodajStudenta(Student student) {
		for(Student s : studenti) {
			if(s.getBrIndex() == student.getBrIndex() && s.getGodina() == student.getGodina() && s.getSmer().equals(student.getSmer())) {
				return false;
			}
		}
		studenti.add(student);
		return true;
	}
	
	public boolean dodajUcionicu(Ucionica ucionica) {
		for(Ucionica u : ucionice) {
			if(u.getNaziv().equals(ucionica.getNaziv()))
				return false;
		}
		ucionice.add(ucionica);
		return true;
	}
	
	public boolean dodajUcionicuPoTerminu(UcionicaObl ucionica) {
		for(UcionicaObl u : ucionicePoTerminima) {
			if(u.getU().getNaziv().equals(ucionica.getU().getNaziv()) && u.getTermin().equals(ucionica.getTermin()))
				return false;
		}
		ucionicePoTerminima.add(ucionica);
		return true;
	}

	public List<Student> getStudenti() {
		return studenti;
	}

	public List<Ucionica> getUcionice() {
		return ucionice;
	}

	public List<UcionicaObl> getUcionicePoTerminima() {
		return ucionicePoTerminima;
	}
	
}
