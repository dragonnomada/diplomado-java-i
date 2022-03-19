public class TestCalculadora {

    public static void main(String[] args) {

        CalculadoraBinaria calculadora = new CalculadoraBinaria();

        calculadora.pulsaUno();
        calculadora.pulsaUno();
        calculadora.pulsaUno();
        calculadora.pulsaUno();
        calculadora.pulsaCero();
        calculadora.pulsaUno();
        calculadora.pulsaUno();

        calculadora.muestraBinario();
        calculadora.describir();

        calculadora.muestraDecimal();
        calculadora.describir();

        calculadora.muestraOctal();
        calculadora.describir();

        calculadora.muestraHexadecimal();
        calculadora.describir();

        calculadora.pulsaLimpiar();

        calculadora.describir();

    }

}
