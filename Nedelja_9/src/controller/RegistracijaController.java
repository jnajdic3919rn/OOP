package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class RegistracijaController implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent event) {
		new Alert(AlertType.CONFIRMATION, "Registrovali ste se!").show();
	}

}
