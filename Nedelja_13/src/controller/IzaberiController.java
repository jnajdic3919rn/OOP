package controller;

import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Biranje;
import model.Database;
import model.Udzbenik;
import view.PrviView;

public class IzaberiController implements EventHandler<ActionEvent> {

	private PrviView pv;
	
	public IzaberiController(PrviView pv) {
		super();
		this.pv = pv;
	}

	@Override
	public void handle(ActionEvent event) {
		pv.getUdzbeniciOl().clear();
		Biranje odabrano = pv.getTabela1().getSelectionModel().getSelectedItem();
		
		for(Udzbenik u : Database.getInstance().getUdzbenici()) {
			if(u.getPredmet().equals(odabrano.getPredmet()) && u.getRazred().equals(odabrano.getRazred())) {
				pv.getUdzbeniciOl().add(u);
			}
		}
	}

}
