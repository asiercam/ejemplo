package es.maestredam;

import java.io.*;
import java.util.ArrayList;

public class LectorCoches {

    public ArrayList<Coche> importFromText(String filename) {
        ArrayList<Coche> listaCoches = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(" ");
                if (partes.length >= 4) {
                    String matricula = partes[0];
                    int anio = Integer.parseInt(partes[1]);
                    int tipo = Integer.parseInt(partes[2]);
                    int volumen = Integer.parseInt(partes[3]);

                    Coche coche = new Coche(matricula, anio, tipo, volumen);
                    listaCoches.add(coche);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } 

        return listaCoches;
    }
}
