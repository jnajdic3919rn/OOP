package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.UcitavanjePodataka;
import view.PrviView;

public class Main extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		UcitavanjePodataka.ucitajStudente("studenti1.txt");
		UcitavanjePodataka.ucitajUcionice("ucionice1.txt");
		Scene sc = new Scene(new PrviView(), 400, 400);
		primaryStage.setScene(sc);
		primaryStage.show();
	}

}
