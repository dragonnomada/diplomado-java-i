public class CalculadoraBinaria {

    private String pantallaPrimaria;
    private String pantallaSecundaria;

    public CalculadoraBinaria() {
        this.pantallaPrimaria = "0";
        this.pantallaSecundaria = "[Bin] 0";
    }

    public void pulsaUno() {
        // TODO: ¿Qué pasa si la pantalla vale "0"?
        // Concatenando dos textos
        this.pantallaPrimaria = this.pantallaPrimaria + "1";
    }

    public void pulsaCero() {
        // TODO: ¿Qué pasa si la pantalla vale "0"?
        // Concatenando dos textos
        this.pantallaPrimaria = this.pantallaPrimaria + "0";
    }

    public void pulsaLimpiar() {
        this.pantallaPrimaria = "0";
        this.pantallaSecundaria = "[Bin] 0";
    }

    public void muestraBinario() {
        this.pantallaSecundaria = "[Bin] " + this.pantallaPrimaria;
    }

    public void muestraDecimal() {
        int suma = 0;

        int N = this.pantallaPrimaria.length();

        for (int i = 0; i <= N - 1; i++) {
            if (this.pantallaPrimaria.charAt(i) == '1') {
                suma = suma + (int)Math.pow(2, N - 1 - i);
            }
        }

        int dec = suma;

        this.pantallaSecundaria = String.format("[DEC] %d", dec);
        // "[DEC] " + dec
    }

    public void muestraOctal() {
        int suma = 0;

        int N = this.pantallaPrimaria.length();

        for (int i = 0; i <= N - 1; i++) {
            if (this.pantallaPrimaria.charAt(i) == '1') {
                suma = suma + (int)Math.pow(2, N - 1 - i);
            }
        }

        int dec = suma;

        this.pantallaSecundaria = String.format("[OCT] %o", dec);
    }

    public void muestraHexadecimal() {
        int suma = 0;

        int N = this.pantallaPrimaria.length();

        for (int i = 0; i <= N - 1; i++) {
            if (this.pantallaPrimaria.charAt(i) == '1') {
                suma = suma + (int)Math.pow(2, N - 1 - i);
            }
        }

        int dec = suma;

        //System.out.printf("Hola %s tienes %d años", "Ana", 23);
        // >> Hola Ana tienes 23 años

        //String mensaje = String.format("Hola %s tienes %d años", "Ana", 23);
        // mensaje = "Hola Ana tienes 23 años";

        this.pantallaSecundaria = String.format("[HEX] %H", dec);
        // dec = 123; // 1111011 -> 0111,1011 -> 7B
        // this.pantallaSecundaria = "[HEX] 7B";
    }

    public void describir() {
        System.out.println("+--------------------------+");
        System.out.println(this.pantallaPrimaria);
        System.out.println(this.pantallaSecundaria);
        System.out.println("+--------------------------+");
        System.out.println();
    }

}
