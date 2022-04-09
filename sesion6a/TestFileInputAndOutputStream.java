import java.io.*;

public class TestFileInputAndOutputStream {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // file1.isFile() | file1.exists() | file1.canRead() | file1.canWrite() | file1.canWrite() | ...

        File file1 = new File("C:\\test\\logo.jpg"); // -->> DESCRIPTOR DEL ARCHIVO 1
        FileInputStream fin = new FileInputStream(file1); // FileNotFoundException

        File file2 = new File("C:\\test\\logo_copia.jpg"); // -->> DESCRIPTOR DEL ARCHIVO 2
        FileOutputStream fout = new FileOutputStream(file2); // FileNotFoundException

        int contador = 0;
        // fin.read() - Leer el próximo byte del archivo
        int b = fin.read(); // retener el próximo byte del archivo 1
        while (b != -1) { // Leemos el próximo byte del archivo 1, comparado contra -1
            System.out.printf("[%d]", b);
            if ((contador + 1) % 20 == 0) {
                System.out.println();
            }
            contador++;
            fout.write(b); // Escribimos el byte al archivo 2
            b = fin.read(); // Volvemos a leer el próximo byte del archivo 1
        }
        System.out.printf("Total bytes: %d", contador);
        System.out.println();

        fin.close(); // IOException
        fout.close();  // IOException

    }

}
