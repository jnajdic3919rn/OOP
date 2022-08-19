package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Database;
import model.Predmet;
import model.Student;

public class UcitajController implements EventHandler<ActionEvent>{

	private ObservableList<Student> studentiOL;
	private ObservableList<Predmet> predmetiOL;
	private ObservableList<String> oceneOL;

	
	public UcitajController(ObservableList<Student> studentiOL, ObservableList<Predmet> predmetiOL,
			ObservableList<String> oceneOL) {
		super();
		this.studentiOL = studentiOL;
		this.predmetiOL = predmetiOL;
		this.oceneOL = oceneOL;
	}


	@Override
	public void handle(ActionEvent event) {
		for(Student s : Database.getInstance().getStudenti())
			studentiOL.add(s);
		predmetiOL.addAll(Database.getInstance().getPredmeti());
		oceneOL.addAll(Database.getInstance().getOcene());	
	}

}
