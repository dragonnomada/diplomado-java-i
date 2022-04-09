import java.io.*;
import java.util.Scanner;

public class TestFileReaderAndWriter {

    public static void main(String[] args) throws IOException {

        File file1 = new File("C:\\test\\datos.txt");
        FileReader reader = new FileReader(file1);

        File file2 = new File("C:\\test\\datos_reporte.txt");
        FileWriter writer = new FileWriter(file2);

        Scanner scanner = new Scanner(reader);

        int n = scanner.nextInt(); scanner.nextLine();

        writer.write(String.format("%d\n", n));

        for (int i = 1; i <= n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt(); scanner.nextLine();

            System.out.printf("%d. x: %d y: %d z: %d\n", i, x, y, z);

            int suma = x + y + z;
            float promedio = suma / 3.0f;

            writer.write(String.format("%d %.4f\n", suma, promedio));
        }
        System.out.println();

        scanner.close();
        reader.close();
        writer.close();

    }

}
