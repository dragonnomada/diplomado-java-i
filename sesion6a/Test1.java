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
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.printf("El archivo no existe: %s\n", e.getMessage());
        } catch (Exception e) {
            System.out.printf("Surgió un error inesperado: %s", e.getMessage());
        }

    }

}
