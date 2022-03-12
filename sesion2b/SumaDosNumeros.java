import java.util.Scanner;

class SumaDosNumeros {

    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Dame A: ");
        a = sc.nextInt();

        System.out.printf("Dame B: ");
        b = sc.nextInt();

        c = a + b;

        System.out.printf("C = %d\n", c);

        sc.close();
    }

}