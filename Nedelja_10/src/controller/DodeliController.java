package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;
import model.Podatak;
import model.Predmet;
import model.Student;

public class DodeliController implements EventHandler<ActionEvent>{

	private ListView<Student> studentiLV;
	private ListView<Predmet> predmetiLV;
	private ListView<String> ocenaLV;
	private ObservableList<Podatak> podaciOL;
	
	public DodeliController(ListView<Student> studentiLV, ListView<Predmet> predmetiLV, ListView<String> ocenaLV,
			ObservableList<Podatak> podaciOL) {
		super();
		this.studentiLV = studentiLV;
		this.predmetiLV = predmetiLV;
		this.ocenaLV = ocenaLV;
		this.podaciOL = podaciOL;
	}

	@Override
	public void handle(ActionEvent event) {
		Student selektovaniStudent = studentiLV.getSelectionModel().getSelectedItem();
		Predmet selektovaniPredmet = predmetiLV.getSelectionModel().getSelectedItem();
		String selektovanaOcena = ocenaLV.getSelectionModel().getSelectedItem();
		
		Podatak podatak = new Podatak(selektovaniStudent.getIme() + " " + selektovaniStudent.getPrezime(),
				selektovaniStudent.getIndex(), selektovaniPredmet.getNaziv(), selektovanaOcena);
		
		podaciOL.add(podatak);
	}

}
