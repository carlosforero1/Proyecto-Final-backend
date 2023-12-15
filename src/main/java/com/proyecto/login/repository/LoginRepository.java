package com.proyecto.login.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.login.entity.Usuario;

public interface LoginRepository extends JpaRepository<Usuario, Integer> {
	
	List<Usuario> findByCorreoAndContrasena(String correo, String contrasena);

}
