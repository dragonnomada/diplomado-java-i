public class TestCasillaSerpienteEscalera {

    public static void main(String[] args) {

        Casilla c1 = new Casilla();
        Casilla c2 = new Casilla();
        CasillaEscalera c3 = new CasillaEscalera();
        Casilla c4 = new Casilla();
        CasillaSerpiente c5 = new CasillaSerpiente();

        c3.setCasillaFinal(c4);
        c5.setCasillaFinal(c2);

        Jugador j1 = new Jugador();

        c3.ponerJugador(j1);

        c5.ponerJugador(j1);

    }

}
