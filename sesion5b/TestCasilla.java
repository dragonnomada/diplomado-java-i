public class TestCasilla {

    public static void main(String[] args) {

        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        Jugador j3 = new Jugador();
        Jugador j4 = new Jugador();

        Casilla c1 = new Casilla();

        System.out.println(c1);

        c1.ponerJugador(j1);
        c1.ponerJugador(j2);
        c1.ponerJugador(j3);

        System.out.println(c1);

        Jugador jq1 = c1.quitarJugador(2);
        Jugador jq2 = c1.quitarJugador(4);

        System.out.println(jq1);
        System.out.println(jq2);

        System.out.println(c1);
    }

}
