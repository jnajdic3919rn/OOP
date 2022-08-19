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
import model.Ucionica;
import model.UcionicaObl;

public class DrugiView extends GridPane{

	private Label studentiLbl;
	private ListView<Student> studentiLv;
	private ObservableList<Student> studentiOl;
	
	private Button dodeliBtn;
	
	private ChoiceBox<String> terminCb;
	private Button ucitajBtn;
	private ListView<UcionicaObl> ucioniceLv;
	private ObservableList<Ucionica>ucioniceOl;
	private ObservableList<UcionicaObl>ucioniceObl;
	
	private TableView<Podatak> podaciTv;
	private ObservableList<Podatak> podaciOl;
	
	private Button snimiBtn;
	
	public DrugiView() {
		
		studentiLbl = new Label("Broj nerasporedjenih studenata: ");
		studentiOl = FXCollections.observableArrayList();
		studentiLv = new ListView<>(studentiOl);
		studentiLv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		podaciOl = FXCollections.observableArrayList();
		
		terminCb = new ChoiceBox<>();
		ucioniceOl = FXCollections.observableArrayList();
		ucioniceObl = FXCollections.observableArrayList();
		ucioniceLv = new ListView<>(ucioniceObl);
		
		podaciTv = new TableView<>(podaciOl);
		TableColumn<Podatak, String> kolona1 = new TableColumn<>("Student");
		kolona1.setCellValueFactory(new PropertyValueFactory<>("student"));
		TableColumn<Podatak, String> kolona2 = new TableColumn<>("Termin");
		kolona2.setCellValueFactory(new PropertyValueFactory<>("termin"));
		TableColumn<Podatak, String> kolona3 = new TableColumn<>("Ucionica");
		kolona3.setCellValueFactory(new PropertyValueFactory<>("ucionica"));
		
		podaciTv.getColumns().add(kolona1);
		podaciTv.getColumns().add(kolona2);
		podaciTv.getColumns().add(kolona3);
		
		ucitajBtn = new Button("Ucitaj za termin");
		ucitajBtn.setOnAction(new UcitajController(this));
		
		snimiBtn = new Button("Snimi");
		
		dodeliBtn = new Button("Dodeli");
		dodeliBtn.setOnAction(new DodeliController(terminCb, studentiOl, ucioniceObl, podaciOl, studentiLv, ucioniceLv, studentiLbl));
		
		this.add(studentiLbl, 0, 0);
		this.add(terminCb, 2, 0);
		this.add(ucitajBtn, 3, 0);
		this.add(studentiLv, 0, 1);
		this.add(dodeliBtn, 1, 1);
		this.add(ucioniceLv, 2, 1, 2, 1);
		this.add(podaciTv, 0, 2, 4, 1);
		this.add(snimiBtn, 1, 3);
		
		this.setAlignment(Pos.CENTER);
		this.setVgap(10);
		this.setHgap(20);
	}

	public ChoiceBox<String> getTerminCb() {
		return terminCb;
	}

	public ObservableList<Student> getStudentiOl() {
		return studentiOl;
	}

	public void setStudentiOl(ObservableList<Student> studentiOl) {
		this.studentiOl = studentiOl;
	}

	public ObservableList<Ucionica> getUcioniceOl() {
		return ucioniceOl;
	}

	public void setUcioniceOl(ObservableList<Ucionica> ucioniceOl) {
		this.ucioniceOl = ucioniceOl;
	}

	public Label getStudentiLbl() {
		return studentiLbl;
	}

	public void setStudentiLbl(Label studentiLbl) {
		this.studentiLbl = studentiLbl;
	}

	public ObservableList<UcionicaObl> getUcioniceObl() {
		return ucioniceObl;
	}
	
	

}
