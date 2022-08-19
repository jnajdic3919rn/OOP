package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Database;
import model.UcionicaPoTerminu;
import view.DrugiView;

public class UcitajController implements EventHandler<ActionEvent>{

	private DrugiView dv;
	
	public UcitajController(DrugiView dv) {
		super();
		this.dv = dv;
	}

	@Override
	public void handle(ActionEvent event) {
		dv.getUcioniceOl().clear();
		String termin = dv.getTerminCb().getValue();
		for(UcionicaPoTerminu upt : Database.getInstance().getUcionicePoTerminu()) {
			if(upt.getTermin().equals(termin))
				dv.getUcioniceOl().add(upt);
		}
		
	}

}
