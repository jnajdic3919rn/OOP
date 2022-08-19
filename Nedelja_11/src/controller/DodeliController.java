package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert.AlertType;
import model.Student;
import model.UcionicaPoTerminu;
import view.DrugiView;
import javafx.scene.control.Alert;

public class DodeliController implements EventHandler<ActionEvent>{

	private DrugiView dv;
	
	public DodeliController(DrugiView dv) {
		super();
		this.dv = dv;
	}

	@Override
	public void handle(ActionEvent event) {
		ObservableList<Student> selektovaniStudenti = dv.getStudentiLv().getSelectionModel().getSelectedItems();
		UcionicaPoTerminu selektovanaUcionica = dv.getUcioniceLv().getSelectionModel().getSelectedItem();
	
		/// provera
		if(selektovaniStudenti.size() > selektovanaUcionica.getKapacitet()) {
			new Alert(AlertType.ERROR, "Previse studenata").show();
			return;
			
		}
	
	}

}
