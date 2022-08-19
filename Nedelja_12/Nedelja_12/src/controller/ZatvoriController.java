package controller;

import app.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ZatvoriController implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		Main.st3.close();

	}

}
