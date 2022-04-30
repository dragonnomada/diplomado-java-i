import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class F701_ReporteEstadistico {

    public static void main(String[] args) throws FileNotFoundException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(new File("E:\\santuario\\cursos.2022\\diplomado-java-i\\sesion7a\\datos\\series.txt"));

        do {
            String titulo = scanner.nextLine();

            System.out.printf("+----------------------+\n");
            System.out.printf("| %-20s |\n", titulo);

            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;
            double suma = 0;
            int total = 0;

            while (scanner.hasNextDouble()) {
                double valor = scanner.nextDouble();
                suma = suma + valor; // s += valor
                total++;
                if (valor < min) {
                    min = valor;
                }
                if (valor > max) {
                    max = valor;
                }
                //System.out.println(valor);
            }
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            // IMPRIMIR EL REPORTE
            double prom = suma / total;

            System.out.printf("|----------------------|\n");
            System.out.printf("| Total:    %10d |\n", total);
            System.out.printf("|----------------------|\n");
            System.out.printf("| Mínimo:   %10.2f |\n", min);
            System.out.printf("| Máximo:   %10.2f |\n", max);
            System.out.printf("|----------------------|\n");
            System.out.printf("| Suma:     %10.2f |\n", suma);
            System.out.printf("| Promedio: %10.2f |\n", prom);
            System.out.printf("+----------------------+\n\n");
        } while(scanner.hasNextLine() && scanner.nextLine().equals(""));

        scanner.close();

    }

}

/*
        Scanner scanner = new Scanner(System.in);

        //String texto = scanner.nextLine();
        //System.out.printf("Tu escribiste: %s\n", texto);

        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Tu edad es: %d\n", edad);

        float peso = scanner.nextFloat();
        scanner.nextLine();

        System.out.printf("Tu peso es: %f\n", peso);

        scanner.close();
 */