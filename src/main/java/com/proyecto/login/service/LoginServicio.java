package com.proyecto.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.proyecto.login.entity.Usuario;
import com.proyecto.login.objeto.Login;
import com.proyecto.login.repository.LoginRepository;

@Service
public class LoginServicio implements ILoginService {
		
	@Autowired
	private LoginRepository loginRepository;

	@Override
	public ResponseEntity<String> iniciarSesion(Login login) {
		List<Usuario> lista = loginRepository.findByCorreoAndContrasena(login.getCorreoElectronico(), login.getContrasena());
		if (lista != null && !lista.isEmpty()) {
			return new ResponseEntity<String>("Usuario Encontrado", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("El usuario no existe", HttpStatus.FORBIDDEN);
		}
	}

	@Override
	public ResponseEntity<String> registrar(Login login) {
		try {
			long totalUsuario = loginRepository.count()+1;
			Usuario nuevo = new Usuario(totalUsuario, login.getUsuario(), login.getCorreoElectronico(), login.getContrasena());
			loginRepository.save(nuevo);
			return new ResponseEntity<String>("Usuario Registrado", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Fallo al guardar", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
