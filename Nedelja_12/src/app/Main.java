package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.UcitavanjePodataka;
import view.PrviView;

public class Main extends Application{

	public static Stage st2;
	public static Stage st3;
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		UcitavanjePodataka.ucitajPlacanja("placanja.txt");
		Scene sc = new Scene(new PrviView(), 500, 300);
		primaryStage.setScene(sc);
		primaryStage.setTitle("OOP - ispit jul");
		primaryStage.show();
	}

}
