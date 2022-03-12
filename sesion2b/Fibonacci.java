import java.util.Scanner;
import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.printf("Dame el límite de números de Fibonacci: ");
        n = sc.nextInt();

        ArrayList<Integer> fibonacci = new ArrayList<Integer>();

        int a = 1;
        int b = 1;
        int c;

        fibonacci.add(a);
        fibonacci.add(b);

        while (fibonacci.size() < n) {
            c = a + b; // actual
            fibonacci.add(c);
            a = b;  // penúltimo
            b = c;  // último
        }

        // for (int i = 0; i < fibonacci.size(); i = i + 1) {
        //     int f = fibonacci.get(i);
        //     System.out.printf("%d ", f);
        // }

        for (int f : fibonacci) {
            System.out.printf("%d ", f);
        }

        System.out.println();

        sc.close();

    }
}
