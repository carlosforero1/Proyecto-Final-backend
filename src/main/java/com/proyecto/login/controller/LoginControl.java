package com.proyecto.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.login.objeto.Login;
import com.proyecto.login.service.ILoginService;

@RestController
@CrossOrigin(origins = "http://localhost:63342") 
public class LoginControl {
	
	@Autowired
	private ILoginService loginService;
	
	@PostMapping("/login/iniciar")
	public ResponseEntity<String> iniciarSesion(@RequestBody Login login) {
		return loginService.iniciarSesion(login);
	}
	
	@PostMapping("/login/registrar")
	public ResponseEntity<String> registrar(@RequestBody Login login) {
		return loginService.registrar(login);
	}

}
