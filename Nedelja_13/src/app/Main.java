package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Database;
import util.UcitavanjePodataka;
import view.PrviView;

public class Main extends Application{

	public static Stage st2;
	
	public static void main(String[] args) {
		UcitavanjePodataka.ucitajUdzbenike("udzbenici-drugitermin.txt");
		UcitavanjePodataka.ucitajBiranja();
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene sc = new Scene(new PrviView(), 600, 600);
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}

}
