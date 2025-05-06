package es.maestredam;

import java.io.IOException;
import java.io.InputStreamReader;

public class Streams1App {

	public static void main(String[] args) {
		
		System.out.printf("Introduce un carácter cualquiera: ");
		// LECTURA - CARACTERES (la fuente es el TECLADO)
		
		 // Elijo la clase InputStreamReader
		
		int car = '?';
		
		// 4) Es obligatorio tratar IOException (try-catch)
		try {
			 // 1) Creo el Stream adecuado:
			 InputStreamReader streamTeclado = new InputStreamReader (System.in);
			 // Leo un carácter
			 car = streamTeclado.read();
			 // Cierro stream
			 streamTeclado.close();
		}catch (IOException e){
		System.out.println("Error e/s: "+ e);			
				}
		
		 System.out.printf("Has tecleado %c %n", car);

		}
	}

