package view;
import controller.RegistracijaController;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class RegistracijaView extends GridPane{

	private HBox hbox;
	private Button pocetnaBtn;
	private Button oStudijamaBtn;
	private Button infoBtn;
	private Label naslovLbl;
	private Label imeLbl;
	private Label prezimeLbl;
	private Label smerLbl;
	private Label korisnickoImeLbl;
	private Label lozinkaLbl;
	private TextField imeTf;
	private TextField prezimeTf;
	private ChoiceBox smerCb;
	private TextField korisnickoImeTf;
	private PasswordField lozinkaPf;
	private Button registrujBtn;
	
	public RegistracijaView() {
		inicijalizacijaElemenata();
		postaviNaGrid();
		initAkcije();
	}

	private void initAkcije() {
		///registrujBtn.setOnAction(new RegistracijaController());
		registrujBtn.setOnAction(e -> {
			new Alert(AlertType.CONFIRMATION, "Registrovali ste se sa korisnickim imenom " + this.korisnickoImeTf.getText() + " na smeru " + this.smerCb.getValue() + "!").show();
		});
	}

	private void postaviNaGrid() {
		this.add(hbox, 0, 0, 3, 1);
		this.add(naslovLbl, 0, 1, 3, 1);
		this.add(imeLbl, 0, 2);
		this.add(imeTf, 1, 2);
		this.add(prezimeLbl, 0, 3);
		this.add(prezimeTf, 1, 3);
		this.add(smerLbl, 0, 4);
		this.add(smerCb, 1, 4);
		this.add(korisnickoImeLbl, 0, 5);
		this.add(korisnickoImeTf, 1, 5);
		this.add(lozinkaLbl, 0, 6);
		this.add(lozinkaPf, 1, 6);
		this.add(registrujBtn, 2, 7);
		
		this.setAlignment(Pos.CENTER);
	}

	private void inicijalizacijaElemenata() {
		hbox = new HBox(10);
		pocetnaBtn = new Button("Pocetna");
		oStudijamaBtn = new Button("O studijama");
		infoBtn = new Button("Info");
		hbox.getChildren().add(pocetnaBtn);
		hbox.getChildren().add(oStudijamaBtn);
		hbox.getChildren().add(infoBtn);
		
		naslovLbl = new Label("Registraciona forma");
		imeLbl = new Label("Ime");
		prezimeLbl = new Label("Prezime");
		smerLbl = new Label("Smer");
		korisnickoImeLbl = new Label("Korisnicko ime");
		lozinkaLbl = new Label("Lozinka");
		imeTf = new TextField();
		imeTf.setPromptText("ime");
		prezimeTf = new TextField();
		smerCb = new ChoiceBox<String>();
		smerCb.setValue("RN");
		smerCb.getItems().add("RN");
		smerCb.getItems().add("RI");
		smerCb.getItems().add("RM");
		korisnickoImeTf = new TextField();
		lozinkaPf = new PasswordField();
		registrujBtn = new Button("Registruj se");
	}
	
}
