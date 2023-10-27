package dad.login;

import java.awt.Checkbox;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Visual extends VBox  {

	public void start(Stage primaryStage) throws Exception {
		
		Label usuario = new Label("Usuario");
		TextField nombre = new TextField();
		
		HBox primerh = new HBox(5,usuario,nombre);
		
		
		Label contraseña = new Label("Contrasena");
		PasswordField contraseñapssw = new PasswordField();
		
		HBox segundoh = new HBox(5, contraseña,contraseñapssw);
		
		CheckBox LDAP = new CheckBox("Usar LDAP");
		
		
		Button acceder = new Button("Acceder");
		Button cancelar = new Button("Cancelar");
		
		
		HBox tercerh = new HBox(5,acceder,cancelar);
		
		VBox root = new VBox(5,primerh,segundoh,LDAP,tercerh);
		root.setAlignment(Pos.CENTER);
		
		
		Scene scene = new Scene(root, 320, 200);

		primaryStage.setTitle("Calculadora");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	
	}

}
