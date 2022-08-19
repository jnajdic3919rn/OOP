package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {

	private static Database instance = null;
	private List<Student> studenti = new ArrayList<>();
	private List<Ucionica> ucionice = new ArrayList<>();
	private List<UcionicaPoTerminu> ucionicePoTerminu = new ArrayList<>();
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		if(instance == null)
			instance = new Database();
		return instance;
	}

	public boolean dodajStudenta(Student student) {
		for(Student s : studenti) {
			if(s.getIndex().equals(student.getIndex()))
				return false;
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
	
	public boolean dodajUcionicuPoTerminu(UcionicaPoTerminu ucionicaPoTerminu) {
		for(UcionicaPoTerminu u : ucionicePoTerminu) {
			if(u.getUcionica().getNaziv().equals(ucionicaPoTerminu.getUcionica().getNaziv()) &&
					u.getTermin().equals(ucionicaPoTerminu.getTermin()))
				return false;
		}
		
		ucionicePoTerminu.add(ucionicaPoTerminu);
		return true;
	}
	
	
	public List<Student> getStudenti() {
		return studenti;
	}

	public List<Ucionica> getUcionice() {
		return ucionice;
	}

	public List<UcionicaPoTerminu> getUcionicePoTerminu() {
		return ucionicePoTerminu;
	}

}
