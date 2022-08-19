package view;

import controller.ZatvoriController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import model.Podatak;

public class TreciView extends VBox{
	
	private VBox labelVb;
	
	private Label minLbl;
	private Label maxLbl;
	
	private ListView<Podatak> listV;
	private Button zatvoriBtn;
	
	public TreciView() {
		minLbl = new Label("Minimalna isplata: ");
		maxLbl = new Label("Maksimalna isplata: ");
		labelVb = new VBox(15);
		labelVb.getChildren().add(minLbl);
		labelVb.getChildren().add(maxLbl);
		labelVb.setPadding(new Insets(0, 15, 0, 15));
		
		listV = new ListView<>();
		
		zatvoriBtn = new Button("Zatvori");
		zatvoriBtn.setOnAction(new ZatvoriController());
		
		this.getChildren().add(labelVb);
		this.getChildren().add(listV);
		this.getChildren().add(zatvoriBtn);
		
		this.setSpacing(10);
		this.setPadding(new Insets(10, 0, 10, 0));
		this.setAlignment(Pos.CENTER);
	}

	public ListView<Podatak> getListV() {
		return listV;
	}

	public Label getMinLbl() {
		return minLbl;
	}

	public Label getMaxLbl() {
		return maxLbl;
	}

}
