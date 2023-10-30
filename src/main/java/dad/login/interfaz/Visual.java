package dad.login.interfaz;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Visual extends VBox {

	

	private Label usuario, contrasena;
	private TextField nombre;
	private PasswordField contrasenapassw;
	private CheckBox LDAP;
	private Button acceder, cancelar;

	public Visual() {

		super();

		usuario = new Label("Usuario:");
		nombre = new TextField();
		nombre.setPromptText("Nombre de usuario");

		contrasena = new Label("Contraseña:");
		contrasenapassw = new PasswordField();
		contrasenapassw.setPromptText("Contraseña del Usuario");
		
		GridPane primerg = new GridPane();
		primerg.setPadding(new Insets(5));
		primerg.setHgap(5);
		primerg.setVgap(5);
		primerg.add(usuario, 0, 0);
		primerg.add(nombre, 1, 0);
		primerg.add(contrasena, 0, 1);
		primerg.add(contrasenapassw, 1, 1);

		primerg.setAlignment(Pos.CENTER);

		LDAP = new CheckBox("Usar LDAP");

		acceder = new Button("Acceder");
		acceder.setDefaultButton(true);
		cancelar = new Button("Cancelar");

		HBox tercerh = new HBox(5, acceder, cancelar);
		tercerh.setAlignment(Pos.CENTER);
		tercerh.setPadding(new Insets(5));
		setAlignment(Pos.CENTER);

		getChildren().addAll(primerg, LDAP, tercerh);
		setSpacing(5);
	}

	
	public Label getUsuario() {
		return usuario;
	}

	public Label getContrasena() {
		return contrasena;
	}

	public TextField getNombre() {
		return nombre;
	}

	public PasswordField getContrasenapassw() {
		return contrasenapassw;
	}

	public CheckBox getLDAP() {
		return LDAP;
	}

	public Button getAcceder() {
		return acceder;
	}

	public Button getCancelar() {
		return cancelar;
	}
}
