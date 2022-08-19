package paket;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Mapa {

	public static void main(String[] args) {
		Map<String, String> mapa1 = new HashMap<>();
		Map<String, String> mapa2 = new LinkedHashMap<>();
		Map<String, String> mapa3 = new TreeMap<>(new IndexComparator());
		
		mapa1.put("3919RN", "Jefimija Najdic");
		mapa1.put("3719RN", "Mladen Jovanovic");
		mapa1.put("4019RN", "Viktor Lucic");
		mapa1.put("3919RN", "Emilija Najdic");
		
		for(Entry<String, String> e : mapa1.entrySet()) {
			System.out.println("Index: " + e.getKey() + " ime i prezime studenta: " + e.getValue());
		}
		
		mapa2.put("OOP", "Bojana");
		mapa2.put("UUP", "Dragan");
		mapa2.put("ORS", "Petar");
		
		for(Entry<String, String> e : mapa2.entrySet()) {
			System.out.println("Predmet: " + e.getKey() + " profesor: " + e.getValue());
		}
		
		
		mapa3.put("6019RN", "Mihajlo Stojanovic");
		mapa3.put("4719RN", "Viktor Lucic");
		mapa3.put("3919RN", "Jefimija Najdic");
		mapa3.put("3719RN", "Mladen Jovanovic");
		mapa3.put("4019RN", "Viktor Lucic");
		
		/**
		for(Entry<String, String> e : mapa3.entrySet()) {
			System.out.println("Index: " + e.getKey() + " student: " + e.getValue());
		}
		*/
		
		Iterator<Entry<String, String>> iterator = mapa3.entrySet().iterator();
		/**
		while(iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		*/
		
		// Uklanjamo viktora
		while(iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			if(entry.getValue().equals("Viktor Lucic"))
				iterator.remove();
		}
		
		for(Entry<String, String> e : mapa3.entrySet()) {
			System.out.println("Index: " + e.getKey() + " student: " + e.getValue());
		}
		
		Map<Student, String> mapa4 = new HashMap<>();
		mapa4.put(new Student("Mihajlo", "Stojanovic", "RN"), "6019RN");
		mapa4.put(new Student("Mihajlo", "Stosic", "RN"), "6019RN");
		mapa4.put(new Student("Mihajlo", "Stojanovic", "RN"), "6019RN");
		mapa4.put(new Student("Ana", "Peric", "RN"), "6019RN");

		for(Entry<Student, String> e : mapa4.entrySet()) {
			System.out.println("Student: " + e.getKey() + " index: " + e.getValue() + " hash " + e.getKey().hashCode());
		}
	
		
	}
}
