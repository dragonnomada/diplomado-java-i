import java.util.ArrayList;

public class Casilla {

    private static int contador = 1;

    private int id;
    private ArrayList<Jugador> jugadores = new ArrayList<>();

    public Casilla() {
        this.id = Casilla.contador++;
    }

    public int getId() {
        return id;
    }

    public void ponerJugador(Jugador jugador) {
        System.out.printf("%s se mueve a la casilla %d\n", jugador, this.id);

        Casilla casillaActual = jugador.getCasilla();

        if (casillaActual != null) {
            casillaActual.quitarJugador(jugador.getId());
        }

        jugador.setCasilla(this);

        jugadores.add(jugador);
    }

    public Jugador getJugador(int id) {
        for (Jugador jugador : jugadores) {
            if (jugador.getId() == id) {
                return jugador;
            }
        }
        return null;
    }

    public Jugador quitarJugador(int id) {
        for (Jugador jugador : jugadores) {
            if (jugador.getId() == id) {
                System.out.printf("%s se abandona a la casilla %d\n", jugador, this.id);
                jugadores.remove(jugador);
                return jugador;
            }
        }
        System.out.printf("[JUGADOR %d] no se encuentra en la casilla %d\n", id, this.id);
        return null;
    }

    @Override
    public String toString() {
        String texto = "";
        texto += "+-------------------+\n";
        texto += String.format("| [%d] Jugadores: %d  |\n", this.id, this.jugadores.size());
        texto += "+-------------------+";
        for (Jugador jugador : jugadores) {
            texto += "\n| " + jugador.toString() + "       |";
        }
        if (jugadores.size() > 1) {
            texto += "\n+-------------------+";
        }
        return texto;
    }
}
