package view;

import controller.PlatiController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class DrugiView extends GridPane{

	private PrviView pv; 
	
	private Label iznosLbl;
	private Label primalacLbl;
	private Label kategorijaLbl;
	
	private TextField iznosTf;
	private TextField primalacTf;
	
	private ChoiceBox<String> kategorijaCb;
	
	private Button platiBtn;
	
	public DrugiView() {
		iznosLbl = new Label("Iznos");
		primalacLbl = new Label("Primalac");
		kategorijaLbl = new Label("Kategorija");
		
		iznosTf = new TextField();
		primalacTf = new TextField();
		
		kategorijaCb = new ChoiceBox<>();
		
		platiBtn = new Button("Plati");
		platiBtn.setOnAction(new PlatiController(this));
		
		this.addRow(0, iznosLbl, iznosTf);
		this.addRow(1, primalacLbl, primalacTf);
		this.addRow(2, kategorijaLbl, kategorijaCb);
		this.addRow(3, platiBtn);
		
		this.setHgap(10);
		this.setVgap(10);
		this.setAlignment(Pos.CENTER);
	}

	public ChoiceBox<String> getKategorijaCb() {
		return kategorijaCb;
	}

	public TextField getIznosTf() {
		return iznosTf;
	}

	public TextField getPrimalacTf() {
		return primalacTf;
	}

	public PrviView getPv() {
		return pv;
	}

	public void setPv(PrviView pv) {
		this.pv = pv;
	}
	
}
