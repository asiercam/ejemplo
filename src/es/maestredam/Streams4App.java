package es.maestredam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Streams4App {

	public static void main(String[] args) throws IOException {
		
		final String FICHERO = "texto1.txt";
		
		// ===============================================
		// EJEMPLO: BufferedREader
		// Mostrar la primera linea de un fichero
		
		try (
				
			FileReader fichero = new FileReader(FICHERO);
				
			BufferedReader br = new BufferedReader(fichero)){
			
			// Muestro la 1ª linea 
			String linea = br.readLine();
			linea = br.readLine();
			System.out.println("2ª )" + linea);
			
			/*linea = br.readLine();
			if (linea != null) {
				System.out.println("3ª) "+ linea);
			} else {
				System.out.println("3ª) NO HAY");
			}*/
			
			// EJERCICIO: Contar las palabras de la 2ª linea
			int cPals = 0;
			String [] palabras = linea.split("\\s+");
			cPals = palabras.length;
			
			System.out.printf("Nº Caracteres: %d\n", linea.length());
			System.out.printf("Nº Palabras: %d\n", cPals);
			

		}catch (IOException ioe) {
			System.out.println("ERROR E/S: "+ ioe);
		}
		
		
		
		// =================================
		// EJEMPLO: BufferedWriter
		// Escribir varias lineas de texto
		try (
				BufferedWriter bw = 
					new BufferedWriter(new FileWriter("index.html"))){
			System.out.println("Generando hmtl...");
			
			bw.write("<ul>");
			bw.newLine();
			bw.write("		<li>Item 1</li>");
			bw.newLine();
			bw.write("		<li>Item 2</li>");
			bw.newLine();
			bw.write("</ul>");

			System.out.println("[Hecho]");
			
		}catch (IOException ioe) {
			System.out.println("ERROR E/S: "+ ioe);
		}
		
		// ========================================
		// EJERCICIO: Hacer copia exacta del fichero index.html
		// y añadirle al final un footer con el nº total de lineas 
		// y de caracteres, la fecha actual y vuestro nombre
		int numLineas = 0;
		
		try (
				BufferedReader brC = new BufferedReader(new FileReader("index.html"));
				
				BufferedWriter bwC = new BufferedWriter(new FileWriter("copia.html"))) {
			
			System.out.println("Copiando el archivo html.......");
			
			int numCars = 0;
			String linea = brC.readLine();
			while (linea != null) {
				bwC.write(linea);
				bwC.newLine();
				numLineas++;
				numCars = numCars + linea.length();
				linea = brC.readLine();
			}
			
			bwC.write("<footer style=\"color:blue\">");
			bwC.newLine();
			bwC.write("     <hr>");
			bwC.newLine();
			bwC.write("       Lineas copiadas: " + numLineas);
			bwC.newLine();
			bwC.write("    <br>");
			bwC.newLine();
			bwC.write("    Caracteres copiados: "+ numCars);
			bwC.newLine();
			bwC.write("    <br>");
			bwC.newLine();
			bwC.write("   "+ new Date().toString());
			bwC.newLine();
			bwC.write("</footer>");

			System.out.println("Archivo copiado!!!!");
			
		}catch (FileNotFoundException fnf) {
            System.out.println("Error e/s: " + fnf);
			
		}catch (IOException ioe) {
			System.out.println("ERROR E/S: "+ ioe);
		}
		
		
		
		
		

	}

}
