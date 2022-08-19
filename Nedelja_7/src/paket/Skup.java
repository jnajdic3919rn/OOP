package paket;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Skup {

	public static void main(String[] args) {
		Set<String> predmeti = new HashSet<>();
		predmeti.add("OOP");
		predmeti.add("UUP");
		predmeti.add("ORS");
		predmeti.add("OS");
		
		System.out.println("Ispis za hashset: " + predmeti);
		
		Set<String> predmetiSort = new TreeSet<>();
		
		predmetiSort.add("OOP");
		predmetiSort.add("UUP");
		predmetiSort.add("ORS");
		predmetiSort.add("OS");
		
		///predmetiSort.addAll(predmeti);
		System.out.println("Ispis za treeset: " + predmetiSort);
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		set1.add(7);
		set1.add(9);
		set1.add(5);
		set1.add(4);
		set1.add(8);
		
		set2.add(9);
		set2.add(10);
		set2.add(4);
		set2.add(1);
		
		Set<Integer> unija = new HashSet<>();
		unija.addAll(set1);
		unija.addAll(set2);
		System.out.println("Ispis za uniju: " + unija);
		
		Set<Integer> presek = new HashSet<>(set1);
		presek.retainAll(set2);
		System.out.println("Ispis za presek: " + presek);
		
		Set<Integer> razlika = new HashSet<>(set1);
		razlika.removeAll(set2);
		System.out.println("Ispis za razlika: " + razlika);
		/*
		for(Integer broj : set1) {
			System.out.println(broj);
		}
		*/
		
		Iterator<Integer> iterator = set1.iterator();
		while(iterator.hasNext()) {
			Integer vrednost = iterator.next();
			System.out.println(vrednost);
		}
		
		iterator = set1.iterator();
		
		/** Exception 
		for(Integer broj : set1) {
			if(broj % 2 == 0)
				set1.remove(broj);
		}
		*/
		
		while(iterator.hasNext()) {
			Integer vrednost = iterator.next();
			if(vrednost%2 == 0)
				iterator.remove();
		}
	
		System.out.println("Nakon uklanjanja");
		for(Integer broj : set1) {
			System.out.println(broj);
		}
		
		
	}

}
