package controller;

import app.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Podatak;
import view.DrugiView;
import view.PrviView;

public class RacunController implements EventHandler<ActionEvent> {

	private PrviView pv;
	
	public RacunController(PrviView pv) {
		super();
		this.pv = pv;
	}

	@Override
	public void handle(ActionEvent event) {
		Main.st2 = new Stage();
		DrugiView dv = new DrugiView();
		double ukupno = 0.0;
		for(Podatak p : pv.getPodaciOl()) {
			for(int i = 0; i<p.getBrojPrimeraka(); i++) {
				dv.getTextArea().appendText(p.toString() + "\n");
			}
			ukupno+=p.getCena();
		}
		dv.getTextArea().appendText("Ukupno: " + ukupno);
		Main.st2.setScene(new Scene(dv, 400, 200));
		Main.st2.show();
	}

}
