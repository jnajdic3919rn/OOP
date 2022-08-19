package view;

import controller.DodeliController;
import controller.UcitajController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Podatak;
import model.Predmet;
import model.Student;

public class Pocetna extends VBox{

	private HBox hBox;
	private Button ucitajBtn;
	private Button dodeliBtn;
	private ListView<Student> studentiLV;
	private ListView<Predmet> predmetiLV;
	private ListView<String> oceneLV;
	private ListView<Podatak> podaciLV;
	private ObservableList<Student> studentiOL;
	private ObservableList<Predmet> predmetiOL;
	private ObservableList<String> oceneOL;
	private ObservableList<Podatak> podaciOL;
	
	private TableView tv;
	
	public Pocetna() {
		hBox = new HBox(10);
		ucitajBtn = new Button("Ucitaj");
		dodeliBtn = new Button("Dodeli");
		
		studentiOL = FXCollections.observableArrayList();
		predmetiOL = FXCollections.observableArrayList();
		oceneOL = FXCollections.observableArrayList();
		studentiLV = new ListView<>(studentiOL);
		predmetiLV = new ListView<>(predmetiOL);
		/// predmetiLV.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		oceneLV = new ListView<>(oceneOL);
		
		ucitajBtn.setOnAction(new UcitajController(studentiOL, predmetiOL, oceneOL));
		
		podaciOL = FXCollections.observableArrayList();
		// podaciLV = new ListView<>(podaciOL);
		
		hBox.getChildren().add(studentiLV);
		hBox.getChildren().add(predmetiLV);
		hBox.getChildren().add(oceneLV);
		hBox.setAlignment(Pos.CENTER);
		
		tv = new TableView<>(podaciOL);
		TableColumn<Podatak, String> kolona1 = new TableColumn<>("Ime i prezime");
		kolona1.setCellValueFactory(new PropertyValueFactory<>("imeIPrezime"));
		TableColumn<Podatak, String> kolona2 = new TableColumn<>("Indeks");
		kolona2.setCellValueFactory(new PropertyValueFactory<>("index"));
		TableColumn<Podatak, String> kolona3 = new TableColumn<>("Naziv predmeta");
		kolona3.setCellValueFactory(new PropertyValueFactory<>("nazivPredmeta"));
		TableColumn<Podatak, String> kolona4 = new TableColumn<>("Ocena");
		kolona4.setCellValueFactory(new PropertyValueFactory<>("ocena"));
		
		tv.getColumns().add(kolona1);
		tv.getColumns().add(kolona2);
		tv.getColumns().add(kolona3);
		tv.getColumns().add(kolona4);
		
		tv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		dodeliBtn.setOnAction(new DodeliController(studentiLV, predmetiLV, oceneLV, podaciOL));
		this.getChildren().add(ucitajBtn);
		this.getChildren().add(hBox);
		this.getChildren().add(dodeliBtn);
		this.getChildren().add(tv);
		this.setSpacing(10);
		this.setAlignment(Pos.CENTER);
	}
	
}
