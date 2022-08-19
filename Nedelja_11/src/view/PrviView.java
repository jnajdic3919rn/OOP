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

public class PrviView extends VBox{
	
	private GridPane unosGp;
	private HBox racunariHb;
	
	private Label naslovLbl;
	private Label terminLbl;
	private Label studentiLbl;
	private Label racunariLbl;
	private Label porukaLbl;
	
	private TextField terminTf;
	private TextField studentiTf;
	
	private Button pokreniBtn;
	
	private CheckBox racunariCb;
	
	public PrviView() {
		unosGp = new GridPane();
		unosGp.setAlignment(Pos.CENTER);
		unosGp.setVgap(5);
		unosGp.setHgap(5);
		racunariHb = new HBox(5);
		racunariHb.setAlignment(Pos.CENTER);
		
		naslovLbl = new Label("Unesite potrebne podatke za raspodelu");
		terminLbl = new Label("Broj termina");
		studentiLbl = new Label("Broj studenata u ucionici");
		racunariLbl = new Label("samo ucionice sa racunarima");
		porukaLbl = new Label("Poruka");
		
		terminTf = new TextField();
		studentiTf = new TextField();
		
		racunariCb = new CheckBox();
		
		pokreniBtn = new Button("Pokreni");
		pokreniBtn.setOnAction(new PokreniController(terminTf, studentiTf, racunariCb, porukaLbl));
		
		unosGp.add(terminLbl, 0, 0);
		unosGp.add(studentiLbl, 0, 1);
		unosGp.add(terminTf, 1, 0);
		unosGp.add(studentiTf, 1, 1);
		
		racunariHb.getChildren().add(racunariCb);
		racunariHb.getChildren().add(racunariLbl);
		
		this.getChildren().add(naslovLbl);
		this.getChildren().add(unosGp);
		this.getChildren().add(racunariHb);
		this.getChildren().add(pokreniBtn);
		this.getChildren().add(porukaLbl);
		
		this.setAlignment(Pos.CENTER);
		this.setSpacing(5);
		
	}

	public Button getPokreniBtn() {
		return pokreniBtn;
	}
	
}
