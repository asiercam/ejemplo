package es.maestredam;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeeNumeros {

	public static void main(String[] args) {
		
		final String FICHERO = "numero.dat";
		
		double[] nums = new double[10];
		double num = 0.0;
		
		try (	DataInputStream dis = new  DataInputStream( new FileInputStream (FICHERO)) ) {
			
			num = dis.readDouble();
			System.out.println(num);

			for (int i = 0; i<nums.length; i++) {
				nums[i] = dis.readDouble();
				System.out.println(nums[i] + ", ");
			}
			
		}catch (FileNotFoundException fne) {
			System.out.println("Archivo no encontrado"+fne);
		}catch (EOFException eof) {
			System.out.println("[FIN]");
		}catch (IOException ioe) {
			System.out.println("ERROR E/S "+ioe);
		}
	}

}
