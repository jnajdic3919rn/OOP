import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.RegistracijaView;

public class Registracija extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(new RegistracijaView());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
