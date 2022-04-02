public class TestDado {

    public static void main(String[] args) {

        Dado dado = new Dado();

        System.out.println(dado); // dado.toString()

        dado.tirar();

        System.out.println(dado);
        System.out.println("-----------------------");

        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        dado1.tirar();
        dado2.tirar();

        int suma = dado1.getValorEntero() + dado2.getValorEntero();

        System.out.println(dado1);
        System.out.println(dado2);
        System.out.println(suma);

    }

}
