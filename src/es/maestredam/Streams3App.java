package es.maestredam;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Streams3App {

    public static void main(String[] args) {
        // LECTURA FICHERO de TEXTO => 
        int car = '?';

        // Uso try-with-resources, para que se cierren automáticamente los "recursos" abiertos
        try (FileReader streamFichero = new FileReader("texto1.txt")) {
            System.out.println("Fichero abierto");

            // Operaciones de Lectura
            car = streamFichero.read();

        } catch (FileNotFoundException fnf) {
            System.out.println("Error e/s: " + fnf);
            
        } catch (IOException ioe) {
            System.out.println("Error e/s: " + ioe);
            
        }

        System.out.println("Fichero cerrado");
        System.out.printf("Hay una %c %n", car);

        // EJERCICIO 1: Copia completa de un fichero de texto
    
        String archivo = "texto1.txt";
        String archivoC = "copia.txt";

        try (FileReader fr = new FileReader(archivo);
             FileWriter fw = new FileWriter(archivoC)) {

            int caracter;
            while ((caracter = fr.read()) != -1) {
                fw.write(caracter); 
            }

            System.out.println("Copia completada");

        } catch (IOException e) {
            System.out.println("EROR E/S: " + e);
        }
        
        // EJERCICIO 2: Copia completa de un fichero de texto, 
        // 							Transformando a mayusculas lo que esté en minusculas y al revés.
        // 							Transformando el caracter en el siguiente, es decir,
        // 							A se transforma en B, a en b, 0 en 1, ......
        
        String archivo1 = "texto1.txt";
        String archivoC1 = "copia.txt";

        try (FileReader fr = new FileReader(archivo);
             FileWriter fw = new FileWriter(archivoC)) {

            int caracter;
            while ((caracter = fr.read()) != -1) {
            	if (caracter >= 97 && caracter <= 122) {
            		if (caracter == 122) {
            			caracter = 97;
            		}else {
            		caracter = Character.toUpperCase(caracter);
                    fw.write(caracter++); 
            		}
            		
            	}else if(caracter >= 65 && caracter <= 90) {
            		if (caracter == 90) {
            			caracter = 65;
            		}else {
            		caracter++;
            		caracter = Character.toLowerCase(caracter);
                    fw.write(caracter++); 
            		}
            	}else if(Character.isAlphabetic(caracter)){
            		fw.write(caracter++); 
            	}
            }

            System.out.println("Copia completada con las modificaciones especificadas.");

        } catch (IOException e) {
            System.out.println("EROR E/S: " + e);
        }
        
        
        
        
        
        
        
        
        
        
        
    }
}