import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class F702_CanastasSincronizadas {

    public static void main(String[] args) {

        ArrayList<Integer> canasta1 = new ArrayList();
        ArrayList<Integer> canasta2 = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.printf("Canasta 1: %s\n", Arrays.toString(canasta1.toArray()));
            System.out.printf("Canasta 2: %s\n", Arrays.toString(canasta2.toArray()));
            System.out.println("-----------------------------------------------");
            System.out.println("1. Agragar a Canasta 1");
            System.out.println("2. Agragar a Canasta 2");
            System.out.println("3. Mover de Canasta 1 a Canasta 2");
            System.out.println("4. Mover de Canasta 2 a Canasta 1");
            System.out.println("5. Salir");
            System.out.println();

            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Dame un entero: ");
                    Integer a = scanner.nextInt();
                    canasta1.add(a);
                    break;
                case 2:
                    System.out.print("Dame un entero: ");
                    Integer b = scanner.nextInt();
                    canasta2.add(b);
                    break;
                case 3:
                    System.out.print("Dame el índice del elemento en la canasta 1: ");
                    int i = scanner.nextInt();

                    Integer x = canasta1.get(i);
                    canasta1.remove(i);

                    canasta2.add(x);
                    break;
                case 4:
                    System.out.print("Dame el índice del elemento en la canasta 2: ");
                    int j = scanner.nextInt();

                    Integer y = canasta2.get(j);
                    canasta2.remove(j);

                    canasta1.add(y);
                    break;
            }

        } while (opcion != 5);

        scanner.close();

    }

}