package view;

import controller.IzaberiController;
import controller.KupiController;
import controller.RacunController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Biranje;
import model.Database;
import model.Podatak;
import model.Udzbenik;

public class PrviView extends VBox{

	private VBox vBox;
	private HBox maliHBox;
	private HBox velikiHBox;
	
	private ObservableList<Udzbenik> udzbeniciOl;
	private ObservableList<Biranje> biranjeOl;
	private ObservableList<Podatak> podaciOl;
	
	private TableView<Biranje> tabela1;
	private TableView<Podatak> tabela2;
	private ListView<Udzbenik> lista;
	
	private Button btnKupi;
	private Button btnIzaberi;
	private Button btnRacun;
	
	private Label lblPrimerak;
	private Label lblKorpa;
	
	private TextField tf;
	
	public PrviView() {
		vBox = new VBox(5);
		maliHBox = new HBox(5);
		velikiHBox = new HBox();
		
		biranjeOl = FXCollections.observableList(Database.getInstance().getBiranja());
		tabela1 = new TableView<>(biranjeOl);
		
		TableColumn<Biranje, String> kolona11 = new TableColumn<>("Razred");
		kolona11.setCellValueFactory(new PropertyValueFactory<>("razred"));
		TableColumn<Biranje, String> kolona12 = new TableColumn<>("Predmet");
		kolona12.setCellValueFactory(new PropertyValueFactory<>("predmet"));
		TableColumn<Biranje, String> kolona13 = new TableColumn<>("Broj");
		kolona13.setCellValueFactory(new PropertyValueFactory<>("broj"));
		
		tabela1.getColumns().add(kolona11);
		tabela1.getColumns().add(kolona12);
		tabela1.getColumns().add(kolona13);
		
		podaciOl = FXCollections.observableArrayList();
		tabela2 = new TableView<>(podaciOl);
		TableColumn<Podatak, String> kolona21 = new TableColumn<>("Naslov");
		kolona21.setCellValueFactory(new PropertyValueFactory<>("naslov"));
		TableColumn<Podatak, String> kolona22 = new TableColumn<>("Izdavac");
		kolona22.setCellValueFactory(new PropertyValueFactory<>("izdavac"));
		TableColumn<Podatak, String> kolona23 = new TableColumn<>("Broj primeraka");
		kolona23.setCellValueFactory(new PropertyValueFactory<>("brojPrimeraka"));
		TableColumn<Podatak, String> kolona24 = new TableColumn<>("Cena");
		kolona24.setCellValueFactory(new PropertyValueFactory<>("cena"));
		
		tabela2.getColumns().add(kolona21);
		tabela2.getColumns().add(kolona22);
		tabela2.getColumns().add(kolona23);
		tabela2.getColumns().add(kolona24);
		udzbeniciOl = FXCollections.observableArrayList();
		lista = new ListView<>(udzbeniciOl);
		lista.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		btnKupi = new Button("Kupi");
		btnKupi.setOnAction(new KupiController(this));
		btnIzaberi = new Button("Izaberi");
		btnIzaberi.setOnAction(new IzaberiController(this));
		btnRacun = new Button("Racun");
		btnRacun.setOnAction(new RacunController(this));
		
		lblPrimerak = new Label("Broj primeraka:");
		lblKorpa = new Label("Korpa:");
		
		tf = new TextField();
		
		maliHBox.getChildren().addAll(lblPrimerak, tf, btnKupi);
		vBox.getChildren().addAll(lista, maliHBox);
		velikiHBox.getChildren().addAll(tabela1, btnIzaberi, vBox);
		velikiHBox.setAlignment(Pos.CENTER);
		
		this.getChildren().addAll(velikiHBox, lblKorpa, tabela2, btnRacun);
		this.setAlignment(Pos.CENTER);
		this.setSpacing(5);
		
	}

	public ObservableList<Udzbenik> getUdzbeniciOl() {
		return udzbeniciOl;
	}

	public TableView<Biranje> getTabela1() {
		return tabela1;
	}

	public TableView<Podatak> getTabela2() {
		return tabela2;
	}

	public ListView<Udzbenik> getLista() {
		return lista;
	}

	public TextField getTf() {
		return tf;
	}

	public ObservableList<Podatak> getPodaciOl() {
		return podaciOl;
	}
	
}
