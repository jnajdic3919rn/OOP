package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {

	private static Database instance = null;
	private List<Student> studenti = new ArrayList<>();
	private List<Predmet> predmeti = new ArrayList<>();
	private List<String> ocene = new ArrayList<>(Arrays.asList("6", "7", "8", "9", "10"));
	
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
	
	public boolean dodajPredmet(Predmet predmet) {
		for(Predmet p : predmeti) {
			if(p.getNaziv().equals(predmet.getNaziv()))
				return false;
		}
		
		predmeti.add(predmet);
		return true;
	}
	
	public List<Student> getStudenti() {
		return studenti;
	}

	public List<Predmet> getPredmeti() {
		return predmeti;
	}

	public List<String> getOcene() {
		return ocene;
	}
	
}
