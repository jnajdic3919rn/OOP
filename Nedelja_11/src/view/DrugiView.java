package view;

import controller.DodeliController;
import controller.UcitajController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import model.Podatak;
import model.Student;
import model.UcionicaPoTerminu;

public class DrugiView extends GridPane{
	
	private Label studentiLbl;
	private ChoiceBox<String >terminCb;
	private Button ucitajBtn;
	private ObservableList<Student> studentiOl;
	private ObservableList<UcionicaPoTerminu> ucioniceOl;
	private ListView<Student> studentiLv;
	private ListView<UcionicaPoTerminu> ucioniceLv;
	private Button dodeliBtn;
	private ObservableList<Podatak> podaciOl;
	private TableView<Podatak> podaciTv;
	private Button snimiBtn;
	
	public DrugiView() {
		studentiLbl = new Label("Broj nerasporedjenih studenata: ");
		terminCb = new ChoiceBox<>();
		ucitajBtn = new Button("Ucitaj za termin");
		
		studentiOl = FXCollections.observableArrayList();
		ucioniceOl = FXCollections.observableArrayList();
		podaciOl = FXCollections.observableArrayList();
		
		studentiLv = new ListView<>(studentiOl);
		studentiLv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		ucioniceLv = new ListView<>(ucioniceOl);
		dodeliBtn = new Button("Dodeli");
		podaciTv = new TableView<>(podaciOl);
		snimiBtn = new Button("Snimi");
		
		TableColumn<Podatak, String> kolona1 = new TableColumn<>("Student");
		kolona1.setCellValueFactory(new PropertyValueFactory<>("student"));
		TableColumn<Podatak, String> kolona2 = new TableColumn<>("Termin");
		kolona2.setCellValueFactory(new PropertyValueFactory<>("termin"));
		TableColumn<Podatak, String> kolona3 = new TableColumn<>("Ucionica");
		kolona3.setCellValueFactory(new PropertyValueFactory<>("ucionica"));
		
		dodeliBtn.setOnAction(new DodeliController(this));
		
		podaciTv.getColumns().add(kolona1);
		podaciTv.getColumns().add(kolona2);
		podaciTv.getColumns().add(kolona3);
		
		ucitajBtn.setOnAction(new UcitajController(this));
		
		this.add(studentiLbl, 0, 0);
		this.add(terminCb, 2, 0);
		this.add(ucitajBtn, 3, 0);
		this.add(studentiLv, 0, 1);
		this.add(dodeliBtn, 1, 1);
		this.add(ucioniceLv, 2, 1, 2, 1);
		this.add(podaciTv, 0, 3, 4, 1);
		this.add(snimiBtn, 1, 4);
		this.setAlignment(Pos.CENTER);
		this.setHgap(20);
		this.setVgap(10);
	}

	public Label getStudentiLbl() {
		return studentiLbl;
	}

	public void setStudentiLbl(Label studentiLbl) {
		this.studentiLbl = studentiLbl;
	}

	public ChoiceBox<String> getTerminCb() {
		return terminCb;
	}

	public void setTerminCb(ChoiceBox<String> terminCb) {
		this.terminCb = terminCb;
	}

	public ObservableList<Student> getStudentiOl() {
		return studentiOl;
	}

	public void setStudentiOl(ObservableList<Student> studentiOl) {
		this.studentiOl = studentiOl;
	}

	public ObservableList<UcionicaPoTerminu> getUcioniceOl() {
		return ucioniceOl;
	}

	public void setUcioniceOl(ObservableList<UcionicaPoTerminu> ucioniceOl) {
		this.ucioniceOl = ucioniceOl;
	}

	public ListView<Student> getStudentiLv() {
		return studentiLv;
	}

	public void setStudentiLv(ListView<Student> studentiLv) {
		this.studentiLv = studentiLv;
	}

	public ListView<UcionicaPoTerminu> getUcioniceLv() {
		return ucioniceLv;
	}

	public void setUcioniceLv(ListView<UcionicaPoTerminu> ucioniceLv) {
		this.ucioniceLv = ucioniceLv;
	}

}
