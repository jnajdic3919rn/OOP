package view;

import controller.PokreniController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PrviView extends VBox {

	private GridPane unosGp;
	private HBox hb3;
	
	private Label naslovLbl;
	private Label terminLbl;
	private Label studentiLbl;
	private Label porukaLbl;
	private Label racunariLbl;
	private TextField terminTf;
	private TextField studentiTf;
	private CheckBox racunariCb;
	private Button pokreniBtn;
	
	public PrviView() {
		naslovLbl = new Label("Unesi potrebne podatke za raspodelu");
		terminLbl = new Label("Broj termina");
		studentiLbl = new Label("Broj studenata u ucionici");
		porukaLbl = new Label("Poruka");
		racunariLbl = new Label("samo ucionica sa racunarima");
		terminTf = new TextField();
		studentiTf = new TextField();
		racunariCb = new CheckBox();
		pokreniBtn = new Button("Pokreni");
		pokreniBtn.setOnAction(new PokreniController(this));
		
		unosGp = new GridPane();
		unosGp.setHgap(5);
		unosGp.setVgap(5);
		hb3 = new HBox(5);
		unosGp.add(terminLbl, 0, 0);
		unosGp.add(terminTf, 1, 0);
		unosGp.add(studentiLbl, 0, 1);
		unosGp.add(studentiTf, 1, 1);
		unosGp.setAlignment(Pos.CENTER);
		hb3.getChildren().add(racunariCb);
		hb3.getChildren().add(racunariLbl);
		
		hb3.setAlignment(Pos.CENTER);
		
		this.getChildren().add(naslovLbl);
		this.getChildren().add(unosGp);
		this.getChildren().add(hb3);
		this.getChildren().add(pokreniBtn);
		this.getChildren().add(porukaLbl);
		
		this.setAlignment(Pos.CENTER);
		this.setSpacing(10);
		
	}

	public Label getPorukaLbl() {
		return porukaLbl;
	}

	public void setPorukaLbl(Label porukaLbl) {
		this.porukaLbl = porukaLbl;
	}

	public CheckBox getRacunariCb() {
		return racunariCb;
	}

	public void setRacunariCb(CheckBox racunariCb) {
		this.racunariCb = racunariCb;
	}

	public TextField getTerminTf() {
		return terminTf;
	}

	public TextField getStudentiTf() {
		return studentiTf;
	}
	
}
