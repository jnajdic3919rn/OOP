package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import model.Podatak;
import model.Student;
import model.UcionicaObl;

public class DodeliController implements EventHandler<ActionEvent> {

	private ChoiceBox<String> terminCb;
	
	private ObservableList<Student> studentiOl;
	private ObservableList<UcionicaObl> ucioniceOl;
	private ObservableList<Podatak> podaciOl;
	
	private ListView<Student> studentiLv;
	private ListView<UcionicaObl> ucioniceLv;
	
	private Label studentiLbl;
	
	public DodeliController(ChoiceBox<String> terminCb, ObservableList<Student> studentiOl, ObservableList<UcionicaObl> ucioniceOl,
			ObservableList<Podatak> podaciOl, ListView<Student> studentiLv, ListView<UcionicaObl> ucioniceLv, Label studentiLbl) {
		this.studentiOl = studentiOl;
		this.ucioniceOl = ucioniceOl;
		this.podaciOl = podaciOl;
		this.studentiLv = studentiLv;
		this.ucioniceLv = ucioniceLv;
		this.terminCb = terminCb;
		this.studentiLbl = studentiLbl;
	}

	@Override
	public void handle(ActionEvent event) {
		String selektovaniTermin = terminCb.getSelectionModel().getSelectedItem();
		ObservableList<Student> selektovaniStudenti = studentiLv.getSelectionModel().getSelectedItems();
		UcionicaObl selektovanaUcionica = ucioniceLv.getSelectionModel().getSelectedItem();
		int kapacitetUcionice = selektovanaUcionica.getRaspolozivo();
		List<Student> studenti = new ArrayList<>(studentiOl);
		if(selektovaniStudenti.size() <= kapacitetUcionice) {
			selektovanaUcionica.setRaspolozivo(kapacitetUcionice-selektovaniStudenti.size());
			Iterator<Student> studentiIterator = studenti.iterator();
			while(studentiIterator.hasNext()) {
				Student s = studentiIterator.next();
				for(Student ss : selektovaniStudenti) {
					if(s.getBrIndex() == ss.getBrIndex() && s.getGodina() == ss.getGodina() && s.getSmer().equals(ss.getSmer())) {
						podaciOl.add(new Podatak(selektovaniTermin, selektovanaUcionica.getU().getNaziv(), s.getIme() + s.getPrezime()));
						studentiIterator.remove();
					}
				}
			}
			studentiOl.clear();
			studentiOl.addAll(studenti);
			this.studentiLbl.setText("Broj nerasporedjenih studenata: " + studentiOl.size());
			List<UcionicaObl> uc = new ArrayList<>(ucioniceOl);
			/**
			for(UcionicaObl u : uc) {
				if(u.getU().getNaziv().equals(selektovanaUcionica.getU().getNaziv()) && u.getTermin().equals(selektovanaUcionica.getTermin()))
						uc.remove(u);
			}
			*/
			ucioniceOl.clear();
			ucioniceOl.addAll(uc);
			/*for(Integer i:indices) {
				studentiOl.remove(i);
			
			}
			studentiLv.refresh();*/
			
		}
		
		
	}

}
