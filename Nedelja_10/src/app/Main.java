package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.UcitavanjePodataka;
import view.Pocetna;

public class Main extends Application{

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		UcitavanjePodataka.ucitajStudente("studenti1.txt");
		UcitavanjePodataka.ucitajPredmete("predmeti.txt");
		Scene scene = new Scene(new Pocetna(), 700, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
