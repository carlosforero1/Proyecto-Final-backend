package com.proyecto.login.service;

import org.springframework.http.ResponseEntity;

import com.proyecto.login.objeto.Login;

public interface ILoginService {
	
	public ResponseEntity<String> iniciarSesion(Login login);
	
	public ResponseEntity<String> registrar(Login login);

}
