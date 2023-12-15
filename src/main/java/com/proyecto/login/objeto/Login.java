package com.proyecto.login.objeto;

public class Login {
	
	private String usuario;
	
	private String correoElectronico;
	
	private String contrasena;
	
	
	public Login() {
	}

	public Login(String usuario, String contrasena,String correoElectronico) {
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.correoElectronico = correoElectronico;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	@Override
	public String toString() {
		return "Login [usuario=" + usuario +"Correo Electronico="+correoElectronico+ ", contrasena=" + contrasena + "]";
	}
	
	

}
