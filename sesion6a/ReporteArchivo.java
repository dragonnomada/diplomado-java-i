import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReporteArchivo {

    String nombre;

    public ReporteArchivo(String nombre) {
        this.nombre = nombre;
    }

    // Desencadenamos la excepción sin tener que controlarla de alguna manera
    // Este método propaga el error y no se hace responsable de controlar la excepción
    public void generarReporte() throws FileNotFoundException { // Puedo arrojar un FileNotFoundException
        File file = new File(this.nombre);

        System.out.printf("Nombre del archivo: %s\n", file.getName());
        System.out.printf("Ruta absoluta: %s\n", file.getAbsolutePath());
        System.out.printf("Existe el archivo? %B\n", file.exists());
        System.out.printf("Es un archivo? %B\n", file.isFile());
        System.out.printf("Se puede leer? %B\n", file.canRead());

        int contador = 0;

        Scanner scanner = new Scanner(file); // Puede arrojar un FileNotFoundException

        while (scanner.hasNextLine()) {
            scanner.nextLine();
            contador++;
        }

        scanner.close();

        System.out.printf("Total de líneas: %d\n", contador);
    }

}
