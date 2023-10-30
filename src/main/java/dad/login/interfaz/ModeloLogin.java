package dad.login.interfaz;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ModeloLogin {

	StringProperty Usuario = new SimpleStringProperty();
	StringProperty Contrasena = new SimpleStringProperty();
	BooleanProperty LDAP = new SimpleBooleanProperty();
	
	
	
	public final StringProperty UsuarioProperty() {
		return this.Usuario;
	}

	public final String getUsuario() {
		return this.UsuarioProperty().get();
	}

	public final void setUsuario(final String Usuario) {
		this.UsuarioProperty().set(Usuario);
	}

	public final StringProperty ContrasenaProperty() {
		return this.Contrasena;
	}

	public final String getContrasena() {
		return this.ContrasenaProperty().get();
	}

	public final void setContrasena(final String Contrasena) {
		this.ContrasenaProperty().set(Contrasena);
	}

	public final BooleanProperty LDAPProperty() {
		return this.LDAP;
	}

	public final boolean isLDAP() {
		return this.LDAPProperty().get();
	}

	public final void setLDAP(final boolean LDAP) {
		this.LDAPProperty().set(LDAP);
	}

}
