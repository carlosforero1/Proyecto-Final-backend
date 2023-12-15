package com.proyecto.lectorTxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class lectorTxt {

    public static List<String> leerArchivo(String rutaArchivo) throws IOException {
        List<String> lineas = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo, StandardCharsets.UTF_8))) {
            String cadena;
            while ((cadena = lector.readLine()) != null) {
                lineas.add(cadena);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lineas;
    }

}
