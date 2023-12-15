package com.proyecto.pruebas;

import com.proyecto.Correos.enviarCorreos;

public class pruebas {

	public static void main(String[] args) {
		String username = "pruepond1@gmail.com";
		String password = "hades2023";
		enviarCorreos enviador = new enviarCorreos(username, password);

		String destinatario = "carlosdanielquinteroforero27@gmail.com";
		String asunto = "Asunto del correo";
		String contenido = "Contenido del correo";

		enviador.enviarCorreo(destinatario, asunto, contenido);
	}
}
