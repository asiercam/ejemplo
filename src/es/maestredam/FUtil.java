package es.maestredam;
import java.io.File;

/**
 *  Práctica de Git/ Entornos
 *  @author Asier Carretero
 */
public class FUtil {
	
	/**
	 * Verifica si un archivo con el nombre especificado existe en el sistema de archivos.
	 *
	 * @param filename el nombre del archivo a verificar; no puede ser nulo ni una cadena vacía o con solo espacios
	 * @return  si el archivo existe devuleve true, en caso contrario false
	 * @throws IllegalArgumentException si el nombre del archivo es nulo, vacío o contiene solo espacios en blanco
	 */
	public static boolean existe(String filename) {
	    if (filename == null || filename.trim().isEmpty()) {
	        throw new IllegalArgumentException("El nombre de archivo no puede estar vacío, ni contener solo espacios");
	    }
	    File file = new File(filename);
	    return file.exists();
	}
}
