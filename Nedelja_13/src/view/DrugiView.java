package view;

import app.Main;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class DrugiView extends VBox{

	private TextArea textArea;
	private Button btnZatvori;
	
	public DrugiView() {
		textArea = new TextArea();
		btnZatvori = new Button("Zatvori");
		
		btnZatvori.setOnAction(e -> {
			Main.st2.close();
		});
		
		this.getChildren().addAll(textArea, btnZatvori);
	}

	public TextArea getTextArea() {
		return textArea;
	}
	
}
