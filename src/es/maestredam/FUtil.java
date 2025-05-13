package es.maestredam;
import java.io.File;

/**
 *  Práctica de Git/ Entornos
 */
public class FUtil {

	public static boolean existe(String filename) {
	    if (filename == null || filename.trim().isEmpty()) {
	        throw new IllegalArgumentException("El nombre de archivo no puede estar vacío, ni contener solo espacios");
	    }
	    File file = new File(filename);
	    return file.exists();
	}
}
