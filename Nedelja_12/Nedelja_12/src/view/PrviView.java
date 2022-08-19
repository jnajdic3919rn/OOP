package view;

import controller.NovoController;
import controller.PregledController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Database;
import model.Placanje;
import model.Tip;

public class PrviView extends VBox{

	private HBox hBox;
	
	private Label stanjeLbl;
	private TableView<Placanje> tabela;
	private ObservableList<Placanje> placanjaOl;
	private Button novoBtn;
	private Button pregledBtn;
	
	public PrviView() {
		placanjaOl = FXCollections.observableList(Database.getInstance().getPlacanja());
		tabela = new TableView<>(placanjaOl);
		tabela.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		novoBtn = new Button("Nova isplata");
		pregledBtn = new Button("Pregled isplata");
		
		stanjeLbl = new Label("Trenutno stanje: " + Placanje.getStanje() + " RSD");
		
		TableColumn<Placanje, String> kolona1 = new TableColumn<>("Iznos");
		kolona1.setCellValueFactory(new PropertyValueFactory<>("iznos"));
		TableColumn<Placanje, String> kolona2 = new TableColumn<>("Uplatilac/Primalac");
		kolona2.setCellValueFactory(new PropertyValueFactory<>("uplatPrim"));
		TableColumn<Placanje, String> kolona3 = new TableColumn<>("Datum");
		kolona3.setCellValueFactory(new PropertyValueFactory<>("datum"));
		TableColumn<Placanje, String> kolona4 = new TableColumn<>("Tip");
		kolona4.setCellValueFactory(new PropertyValueFactory<>("tip"));
		
		tabela.getColumns().add(kolona1);
		tabela.getColumns().add(kolona2);
		tabela.getColumns().add(kolona3);
		tabela.getColumns().add(kolona4);
		
		hBox = new HBox(15);
		hBox.getChildren().add(novoBtn);
		novoBtn.setOnAction(new NovoController(this));
		hBox.getChildren().add(pregledBtn);
		pregledBtn.setOnAction(new PregledController(this));
		hBox.setAlignment(Pos.CENTER);
		
		this.getChildren().add(stanjeLbl);
		this.getChildren().add(tabela);
		this.getChildren().add(hBox);
		
		this.setSpacing(10);
		this.setPadding(new Insets(10, 0, 10, 0));
		this.setAlignment(Pos.CENTER);
		
	}

	public TableView<Placanje> getTabela() {
		return tabela;
	}

	public ObservableList<Placanje> getPlacanjaOl() {
		return placanjaOl;
	}

	public Label getStanjeLbl() {
		return stanjeLbl;
	}

	public void setStanjeLbl(Label stanjeLbl) {
		this.stanjeLbl = stanjeLbl;
	}

}
