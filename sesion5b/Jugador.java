public class Jugador {

    private static int contador = 1;

    private int id; // 0
    Casilla casilla;

    public Jugador() {
        this.id = Jugador.contador++;
    }

    public int getId() {
        return id;
    }

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    @Override
    public String toString() {
        return String.format("[JUGADOR %d]", id);
    }
}
