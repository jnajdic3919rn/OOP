package controller;

import app.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Database;
import view.DrugiView;
import view.PrviView;

public class NovoController implements EventHandler<ActionEvent> {

	private PrviView pv;
	
	public NovoController(PrviView pv) {
		this.pv = pv;
	}

	@Override
	public void handle(ActionEvent event) {
		DrugiView dv = new DrugiView();
		Scene sc = new Scene(dv, 300, 200);
		for(String kategorija : Database.getInstance().getKategorije()) {
			dv.getKategorijaCb().getItems().add(kategorija);
		}
		dv.getKategorijaCb().setValue(dv.getKategorijaCb().getItems().get(0));
		dv.setPv(pv);
		Main.st2 = new Stage();
		Main.st2.setTitle("OOP - ispit jul");
		Main.st2.setScene(sc);
		Main.st2.show();
	}

}
