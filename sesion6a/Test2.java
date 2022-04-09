import java.io.FileNotFoundException;

public class Test2 {

    public static void main(String[] args) {

        ReporteArchivo reporteArchivo = new ReporteArchivo("C:\\test\\demo.txt");

        try {
            reporteArchivo.generarReporte();
        } catch (FileNotFoundException e) {
            System.out.printf("El archivo no existe: %s\n", e.getMessage());
        }

    }

}
