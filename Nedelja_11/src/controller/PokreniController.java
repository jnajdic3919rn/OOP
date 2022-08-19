package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Database;
import model.Ucionica;
import model.UcionicaObl;
import view.DrugiView;

public class PokreniController implements EventHandler<ActionEvent>{

	private TextField brojTermina;
	private TextField brojStudenata;
	private CheckBox racunariCb;
	private Label porukaLbl;
	
	public PokreniController(TextField brojTermina, TextField brojStudenata, CheckBox racunariCb, Label porukaLbl) {
		super();
		this.brojTermina = brojTermina;
		this.brojStudenata = brojStudenata;
		this.racunariCb = racunariCb;
		this.porukaLbl = porukaLbl;
	}

	@Override
	public void handle(ActionEvent event) {
		if(pokretanje() == false) {
			return;
		}
		Stage stage = new Stage();
		DrugiView root = new DrugiView();
		root.getStudentiLbl().setText(root.getStudentiLbl().getText() + Database.getInstance().getStudenti().size());
		for(int i = 1; i<=Integer.valueOf(brojTermina.getText()); i++)
			root.getTerminCb().getItems().add("termin" + i);
		root.getTerminCb().setValue(root.getTerminCb().getItems().get(0));
		
		root.getStudentiOl().setAll(Database.getInstance().getStudenti());
		
		for(String termin : root.getTerminCb().getItems()) {
			for(Ucionica u : Database.getInstance().getUcionice()) {
				if(!racunariCb.isSelected() || (racunariCb.isSelected() && u.getTip().equals("R"))) {
					if(u.getTip().equals("A")) {
						UcionicaObl ul = new UcionicaObl(u, termin, Integer.valueOf(brojStudenata.getText())*2);
						Database.getInstance().dodajUcionicuPoTerminu(ul);
						///u.setBrojStudenata(Integer.valueOf(brojStudenata.getText())*2);
						///u.studentiPoTerminima(Integer.valueOf(brojTermina.getText()), Integer.valueOf(brojStudenata.getText())*2);
					}
					else {
						UcionicaObl ul = new UcionicaObl(u, termin, Integer.valueOf(brojStudenata.getText()));
						Database.getInstance().dodajUcionicuPoTerminu(ul);
						///u.setBrojStudenata(Integer.valueOf(brojStudenata.getText()));
						///u.studentiPoTerminima(Integer.valueOf(brojTermina.getText()), Integer.valueOf(brojStudenata.getText()));
					}
				}
			}
		}
		for(UcionicaObl u : Database.getInstance().getUcionicePoTerminima()){
			if(u.getTermin().equals(root.getTerminCb().getItems().get(0)))
				root.getUcioniceObl().add(u);
		}
		Scene sc = new Scene(root);
		stage.setScene(sc);
		stage.show();
	}

	private boolean pokretanje() {
		try {
			int brTermina = Integer.valueOf(brojTermina.getText());
			int brStudenata = Integer.valueOf(brojStudenata.getText());
			
			int ukupnoStudenata = 0;
			boolean racunari = racunariCb.isSelected();
			for(Ucionica u : Database.getInstance().getUcionice()) {
				if(!racunari || (racunari && u.getTip().equals("R")))
					if(u.getTip().equals("A"))
						ukupnoStudenata += brStudenata*2;
					else
						ukupnoStudenata += brStudenata;
				
			}
			
			ukupnoStudenata *= brTermina;
			
			if(ukupnoStudenata < Database.getInstance().getStudenti().size()) {
				porukaLbl.setText("Nije moguca raspodela");
				return false;
			}
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			porukaLbl.setText("Pogresan format broja");
			return false;
		}
	}

}
