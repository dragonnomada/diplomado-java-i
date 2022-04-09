import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test1 {

    // Método público estático,
    // que devuelve void (sin retorno)
    // llamado main
    // recibe un arreglo de argumentos (String[] args)
    // Denominado el PUNTO DE ENTRADA / PUNTO DE EJECUCIÓN / MÉTODO DE INICIO
    public static void main(String[] args) {
        File file = new File("C:\\test\\demo.txt");

        System.out.printf("Nombre del archivo: %s\n", file.getName());
        System.out.printf("Ruta absoluta: %s\n", file.getAbsolutePath());
        System.out.printf("Existe el archivo? %B\n", file.exists());
        System.out.printf("Es un archivo? %B\n", file.isFile());
        System.out.printf("Se puede leer? %B\n", file.canRead());

        try {
            Scanner scanner = new Scanner(file); // Puede provocar un error: FileNotFoundException

            while (scanner.hasNextLine()) { // Mientras haya una siguiente línea
                String line = scanner.nextLine(); // Recupera la siguiente línea
                System.out.println(line); // Imprime la línea en la salida estándar
            }

            scanner.close(); // Cierra el scanner sobre el archivo
        } catch (FileNotFoundException e) {
            // En caso de que ocurra un FileNotFoundException, informa al usuario, sin romper el programa
            System.out.printf("El archivo no existe: %s\n", e.getMessage());
        } catch (Exception e) {
            // En caso de que ocurra otra excepción, informa al usuario, sin romper el programa
            System.out.printf("Surgió un error inesperado: %s", e.getMessage());
        } finally {
            // Se ejecuta siempre: si sale bien el try o si cae en algún catch
            System.out.println("Fin del programa");
        }

    }

}
