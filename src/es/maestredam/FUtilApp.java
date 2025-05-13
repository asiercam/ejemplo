package es.maestredam;

public class FUtilApp {
    public static void main(String[] args) {
        String[] archivos = {
            "texto1.txt",
            "carpeta",
            "inexistente.docx",
            " "
        };

        for (String archivo : archivos) {
            boolean existe = FUtil.existe(archivo);
            System.out.println("¿Existe \"" + archivo + "\"? " + (existe ? "Sí" : "No"));
        }
    }
}