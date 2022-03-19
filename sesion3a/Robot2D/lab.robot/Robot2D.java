package lab.robot;

public class Robot2D {

    // Atributos
    private String nombre;
    private int x;
    private int y;
    private char orientacion; // 'N', 'E', 'S', 'O'

    // Constructor
    // -> Es un método especial que se manda a llamar
    //    cuándo usamos `new Robot2D(...parámetro)`
    //    y sirve para establecer los valores iniciales
    //    de los atributos
    Robot2D(String nombre) {
        this.nombre = nombre;
        this.x = 0;
        this.y = 0;
        this.orientacion = 'N';
    }

    // Métodos
    void verNorte() {
        this.orientacion = 'N';
    }

    void verEste() {
        this.orientacion = 'E';
    }

    void verSur() {
        this.orientacion = 'S';
    }

    void verOeste() {
        this.orientacion = 'O';
    }

    void avanzar() {
        if (this.orientacion == 'N') {
            this.y = this.y + 1;
        } else if (this.orientacion == 'E') {
            this.x = this.x + 1;
        } else if (this.orientacion == 'S') {
            this.y = this.y - 1;
        } else if (this.orientacion == 'O') {
            this.x = this.x - 1;
        } else {
            System.out.println("No conozco esa orientación >:(");
        }
    }

    // void gSM() <<< -_-!
    void girarEnSentidoManecillas() {
        if (this.orientacion == 'N') {
            this.orientacion = 'E';
        } else if (this.orientacion == 'E') {
            this.orientacion = 'S';
        } else if (this.orientacion == 'S') {
            this.orientacion = 'O';
        } else if (this.orientacion == 'O') {
            this.orientacion = 'N';
        } else {
            System.out.println("No conozco esa orientación >:(");
        }
    }

    void girarEnSentidoContrarioManecillas() {
        if (this.orientacion == 'N') {
            this.orientacion = 'O';
        } else if (this.orientacion == 'E') {
            this.orientacion = 'N';
        } else if (this.orientacion == 'S') {
            this.orientacion = 'E';
        } else if (this.orientacion == 'O') {
            this.orientacion = 'S';
        } else {
            System.out.println("No conozco esa orientación >:(");
        }
    }

    void describir() {
        System.out.printf("#%s (%d, %d) [%c]\n",
                this.nombre, this.x, this.y, this.orientacion);
    }

}