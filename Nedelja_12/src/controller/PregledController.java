package controller;

import java.util.ArrayList;
import java.util.List;

import app.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Placanje;
import model.Podatak;
import model.Tip;
import view.PrviView;
import view.TreciView;

public class PregledController implements EventHandler<ActionEvent> {

	private PrviView pv;
	
	public PregledController(PrviView pv) {
		this.pv = pv;
	}

	@Override
	public void handle(ActionEvent event) {
		Main.st3 = new Stage();
		TreciView tv = new TreciView();
		ObservableList<Podatak> podaci = FXCollections.observableArrayList();
		ObservableList<Placanje> isplate = pv.getTabela().getSelectionModel().getSelectedItems();
		boolean postoji;
		boolean first = true;
		int min = 0, max = 0;
		for(Placanje p : isplate) {
			postoji = false;
			if(p.getTip().equals(Tip.ISPLATA)) {
				if(first) {
					first = false;
					min = p.getIznos();
					max = p.getIznos();
				}
				else {
					if(p.getIznos() < min)
						min = p.getIznos();
					if(p.getIznos() > max)
						max = p.getIznos();
				}
				for(Podatak pod : podaci) {
					if(p.getKategorija().equals(pod.getKategorija())) {
						pod.setIznos(pod.getIznos() + p.getIznos());
						pod.setBrojPlacanja(pod.getBrojPlacanja() + 1);
						postoji = true;
						break;
					}
				}
				if(!postoji) {
					podaci.add(new Podatak(p.getKategorija(), p.getIznos(), 1));
				}	
			}
		}
		
		tv.getListV().setItems(podaci);
		tv.getMinLbl().setText(tv.getMinLbl().getText() + min + " RSD");
		tv.getMaxLbl().setText(tv.getMaxLbl().getText() + max + " RSD");
		Scene sc = new Scene(tv, 400, 500);
		Main.st3.setScene(sc);
		Main.st3.setTitle("OOP - ispit jul");
		Main.st3.show();
	}

}
