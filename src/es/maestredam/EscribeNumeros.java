package es.maestredam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribeNumeros {

	public static void main(String[] args) {
		
		final String FICHERO = "numero.dat";
		
		double num = 78.36;
		double[] numeros = {57.64, 34.76, 24.87, 97.34, 53.65, 23.86};
		
		// Creo objeto DataOutputStream (filtro para codificar el dato),
		// usando un objeto FileOutputStream como "canal" de salida de tipo Binario.
		try (	DataOutputStream dos = new  DataOutputStream( new FileOutputStream (FICHERO)) ) {
			
			// Escribo el dato 
			// dos.writeUTF(cadena);
			// dos.writeInt(entero);
			dos.writeDouble(num);
			
			for (double n: numeros) {
				dos.writeDouble(n);
			}
			
		}catch (IOException ioe) {
			System.out.println("ERROR E/S "+ioe);
		}

		
		
		
	}

}
