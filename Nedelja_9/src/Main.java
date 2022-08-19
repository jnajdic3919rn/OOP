import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch();
	}
	
	private void initGridPane(Stage stage) {
		GridPane grid = new GridPane();
		Label labela1 = new Label("Labela 1 nesto jos teksta");
		Label labela2 = new Label("Labela 2");
		TextField textPolje = new TextField("Text u polju");
		Button btn = new Button("Dugme");
		grid.add(labela1, 0, 0, 2, 1);
		grid.add(labela2, 0, 1);
		grid.add(textPolje, 1, 1);
		grid.add(btn, 1, 2);
		grid.setHgap(10);
		grid.setVgap(20);
		Scene scene = new Scene(grid, 300, 300);
		stage.setScene(scene);
		stage.show();
	}
	
	private void initBorderPane(Stage stage) {
		HBox hbox = new HBox(5);
		hbox.getChildren().add(new Button("btn1"));
		hbox.getChildren().add(new Button("btn2"));
		hbox.getChildren().add(new Button("btn3"));
		hbox.getChildren().add(new Button("btn4"));
		hbox.setAlignment(Pos.BASELINE_CENTER);
		VBox vbox = new VBox(5);
		vbox.getChildren().add(new Button("vbtn1"));
		vbox.getChildren().add(new Button("vbtn2"));
		vbox.getChildren().add(new Button("vbtn3"));
		vbox.getChildren().add(new Button("vbtn4"));
		vbox.setAlignment(Pos.CENTER);
		BorderPane bp = new BorderPane();
		bp.setTop(hbox);
		bp.setBottom(new TextField("Bottom"));
		bp.setLeft(new TextField("Left"));
		bp.setRight(new TextField("Right"));
		bp.setCenter(vbox);
		bp.setPadding(new Insets(10, 20, 10, 20));
		Scene scene = new Scene(bp, 500, 300);
		stage.setScene(scene);
		stage.show();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		/**
		Label label = new Label("Uvod u javafx");
		Pane pane = new Pane(label);
		pane.getChildren().add(new Label("Nova labela"));
		Scene scene = new Scene(pane, 300, 300);
		
		primaryStage.setTitle("Prozor");
		primaryStage.setScene(scene);
		primaryStage.show();
		*/
		///initGridPane(primaryStage);
		///initBorderPane(primaryStage);
	}

}
