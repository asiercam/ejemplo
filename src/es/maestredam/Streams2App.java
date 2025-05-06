package es.maestredam;

import java.io.FileReader;
import java.io.IOException;


public class Streams2App {

	public static void main(String[] args) {
		// LECTURA - CARACTERES (la fuente es el TECLADO)
		
		 // Elijo la clase InputStreamReader
		
		int car = '?';
		
		// 4) Es obligatorio tratar IOException (try-catch)
		try {
			 // 1) Creo el Stream adecuado:
			 FileReader streamFichero = new FileReader ("texto1.txt");
			 // Leo un carácter
			 car = streamFichero.read();
			 // Cierro stream
			 streamFichero.close();
			 
		}catch (IOException e){
		System.out.println("Error e/s: "+ e);			
				}
		
		 System.out.printf("Hay una %c %n", car);

		System.out.println("");
		System.out.println("");
	
	// Ejercicio 2: Mostrar en consola los 3 primeros caracteres de un fichero de texto
	
		 StringBuffer sb = new StringBuffer();
		 
		// 4) Es obligatorio tratar IOException (try-catch)
			try {
				 // 1) Creo el Stream adecuado:
				 FileReader streamFichero = new FileReader ("texto1.txt");
				 // Leo 3 caracteres
				 for (int i=0; i<3;i++) {
				 
				 car = streamFichero.read();
				 
				 // añado el caracter
				 sb.append((char)car);
				 }
				 
				 // Cierro stream
				 streamFichero.close();
				 
			}catch (IOException e){
			System.out.println("Error e/s: "+ e);			
					}
			
			 System.out.println("Las 3 primeras letras son:"+ sb.toString());

			 
			System.out.println("");
			System.out.println("");
			
			 
	// Ejercicio 3: Mostrar en consola todos los caracteres de un fichero de texto
	
		StringBuffer sb2 = new StringBuffer();
		 
		// 4) Es obligatorio tratar IOException (try-catch)
			try {
				 // 1) Creo el Stream adecuado:
				 FileReader streamFichero = new FileReader ("texto1.txt");
				 // Leo 3 caracteres
				 while (car!=-1) {
				 
				 car = streamFichero.read();
				 
				 // añado el caracter
				 sb2.append((char)car);
				 }
				 
				 // Cierro stream
				 streamFichero.close();
				 
			}catch (IOException e){
			System.out.println("Error e/s: "+ e);			
					}
			
			 System.out.println("El texto completo es: ");
			 System.out.println(sb2.toString());
	
			}
	}

