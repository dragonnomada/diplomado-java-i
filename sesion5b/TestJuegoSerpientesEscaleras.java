public class TestJuegoSerpientesEscaleras {

    public static void main(String[] args) {

        JuegoSerpientesEscaleras juego = new JuegoSerpientesEscaleras();

        juego.agregarJugador();
        juego.agregarJugador();
        juego.agregarJugador();
        juego.agregarJugador();
        juego.agregarJugador();

        juego.agregarCasilla(TipoCasilla.NORMAL);    // 1
        juego.agregarCasilla(TipoCasilla.ESCALERA);  // 2
        juego.agregarCasilla(TipoCasilla.NORMAL);    // 3
        juego.agregarCasilla(TipoCasilla.NORMAL);    // 4
        juego.agregarCasilla(TipoCasilla.NORMAL);    // 5

        juego.agregarCasilla(TipoCasilla.NORMAL);    // 6
        juego.agregarCasilla(TipoCasilla.ESCALERA);  // 7
        juego.agregarCasilla(TipoCasilla.NORMAL);    // 8
        juego.agregarCasilla(TipoCasilla.NORMAL);    // 9
        juego.agregarCasilla(TipoCasilla.NORMAL);    // 10

        juego.agregarCasilla(TipoCasilla.NORMAL);    // 11
        juego.agregarCasilla(TipoCasilla.ESCALERA);  // 12
        juego.agregarCasilla(TipoCasilla.SERPIENTE); // 13
        juego.agregarCasilla(TipoCasilla.NORMAL);    // 14
        juego.agregarCasilla(TipoCasilla.ESCALERA);  // 15

        juego.agregarCasilla(TipoCasilla.NORMAL);    // 16
        juego.agregarCasilla(TipoCasilla.SERPIENTE); // 17
        juego.agregarCasilla(TipoCasilla.NORMAL);    // 18
        juego.agregarCasilla(TipoCasilla.NORMAL);    // 19
        juego.agregarCasilla(TipoCasilla.ESCALERA);  // 20

        juego.agregarCasilla(TipoCasilla.NORMAL);    // 21
        juego.agregarCasilla(TipoCasilla.NORMAL);    // 22
        juego.agregarCasilla(TipoCasilla.SERPIENTE); // 23
        juego.agregarCasilla(TipoCasilla.SERPIENTE); // 24
        juego.agregarCasilla(TipoCasilla.NORMAL);    // 25

        juego.conectarSerpiente(13, 4);
        juego.conectarSerpiente(17, 6);
        juego.conectarSerpiente(23, 9);
        juego.conectarSerpiente(24, 18);

        juego.conectarEscalera(2, 8);
        juego.conectarEscalera(7, 18);
        juego.conectarEscalera(12, 19);
        juego.conectarEscalera(15, 24);
        juego.conectarEscalera(20, 22);

        while (juego.activo()) {
            juego.siguienteTurno();
            System.out.println("*****************************");
        }

        System.out.printf("GANADOR: %s\n", juego.ganador);

    }

}
