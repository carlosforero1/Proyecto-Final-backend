package com.proyecto.login.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	private long id;
	
	@Column
	private String usuario;
	
	@Column
	private String correo;
	
	@Column
	private String contrasena;
	

	public Usuario() {
	}


	public Usuario(long id, String usuario, String contrasena, String correo) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.correo = correo;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
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


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}	

}
