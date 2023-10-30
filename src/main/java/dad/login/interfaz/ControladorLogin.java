package dad.login.interfaz;

import dad.login.App;
import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ControladorLogin {

	private ModeloLogin modelo = new ModeloLogin();

	private Visual vista = new Visual();
	
	public ControladorLogin() {
		
		modelo.UsuarioProperty().bind(vista.getNombre().textProperty());
		modelo.ContrasenaProperty().bind(vista.getContrasenapassw().textProperty());
		modelo.LDAPProperty().bind(vista.getLDAP().selectedProperty());
		vista.getAcceder().setOnAction(this::OnAccederAction);
		vista.getCancelar().setOnAction(this::OnCancelarAction);
	}

	public ModeloLogin getModelo() {
		return modelo;
	}

	public Visual getVista() {
		return vista;
	}
	private void OnAccederAction(ActionEvent e) {
		
	boolean useLdap = modelo.isLDAP();
		
		AuthService auth = useLdap  ? new LdapAuthService() : new FileAuthService();
		
		try {
			if(auth.login(modelo.getUsuario(), modelo.getContrasena())) { 
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Iniciar sesion");
				alert.setHeaderText("Acceso permitido");
				alert.setContentText("Las credenciales de acceso son validas");
				alert.showAndWait();
				
				App.getStage().close();
			}else {
				
				Alert alertNO = new Alert(AlertType.ERROR);
				alertNO.setTitle("Iniciar sesion");
				alertNO.setHeaderText("Acceso Denegado");
				alertNO.setContentText("El usuario y/o la contraseña no son validos");
				alertNO.showAndWait();
				
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	private void OnCancelarAction(ActionEvent e) {
		
		App.getStage().close();
		
		
	}
	
}
