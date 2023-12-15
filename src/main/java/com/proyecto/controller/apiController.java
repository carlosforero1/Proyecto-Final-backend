package com.proyecto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.determinadorVirus.tipoVirus;

@RestController
@CrossOrigin(origins = "http://localhost:63342") 
public class apiController {

	@PostMapping("/datos")
	public ResponseEntity<String> obtenerDatos(@RequestBody descripcionBody descripcion) {
		tipoVirus tipo = new tipoVirus();
		return ResponseEntity.ok(tipo.deteminarVirus(descripcion.getDescripcion()));
	}
}
