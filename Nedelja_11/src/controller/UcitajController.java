package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Database;
import model.UcionicaObl;
import view.DrugiView;

public class UcitajController implements EventHandler<ActionEvent>{

	private DrugiView dv;
	
	public UcitajController(DrugiView dv) {
		this.dv = dv;
	}

	@Override
	public void handle(ActionEvent event) {
		String termin = dv.getTerminCb().getSelectionModel().getSelectedItem();
		dv.getUcioniceObl().clear();
		for(UcionicaObl u : Database.getInstance().getUcionicePoTerminima()){
			if(u.getTermin().equals(termin))
				dv.getUcioniceObl().add(u);
		}
		
	}

}
