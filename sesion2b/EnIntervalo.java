import java.util.Scanner;

public class EnIntervalo {
    
    public static void main(String[] args) {
        
        // DEFINIR x COMO real;

        // IMPRIMIR "Dame un número:";
        // LEER x;

        // SI (x >= 1 Y x < 5) O (x > 10 Y x <= 15) ENTONCES
        //     IMPRIMIR "Está en el intervalo";
        // SINO
        //     IMPRIMIR "No está en el intervalo";
        // FIN SI

        double x;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Dame un número: ");
        x = sc.nextDouble();

        if ( (x >= 1 && x < 5) || (x > 10 && x <= 15) ) {
            System.out.println("Está en el intervalo");
        } else {
            System.out.println("No está en el intervalo");
        }

        sc.close();

    }

}
