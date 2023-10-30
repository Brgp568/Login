package dad.login;

import dad.login.interfaz.ControladorLogin;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private static Stage stage;
	private ControladorLogin controlador = new ControladorLogin();

	@Override
	public void start(Stage primaryStage) throws Exception {

		stage = primaryStage;

		Scene scene = new Scene(controlador.getVista(), 320, 200);

		primaryStage.setTitle("Iniciar sesion");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static Stage getStage() {
		return stage;
	}
}
