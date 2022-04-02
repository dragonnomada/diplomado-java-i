import java.util.ArrayList;

public class JuegoSerpientesEscaleras {

    private Dado dado1;
    private Dado dado2;

    ArrayList<Jugador> jugadores;

    ArrayList<Casilla> casillas;

    int turno = 0;

    Jugador ganador = null;

    public JuegoSerpientesEscaleras() {
        this.dado1 = new Dado();
        this.dado2 = new Dado();
        this.jugadores = new ArrayList<>();
        this.casillas = new ArrayList<>();
    }

    public void agregarJugador() {
        this.jugadores.add(new Jugador());
    }

    public void agregarCasilla(TipoCasilla tipoCasilla) {
        switch (tipoCasilla) {
            case NORMAL:
                this.casillas.add(new Casilla());
                break;
            case SERPIENTE:
                this.casillas.add(new CasillaSerpiente());
                break;
            case ESCALERA:
                this.casillas.add(new CasillaEscalera());
                break;
        }
    }

    public void conectarSerpiente(int idCasillaSerpiente, int idCasillaFinal) {
        CasillaSerpiente casillaSerpiente = null;

        for (Casilla casilla : casillas) {
            if (casilla.getId() == idCasillaSerpiente) {
                casillaSerpiente = (CasillaSerpiente) casilla;
            }
        }

        if (casillaSerpiente == null) {
            throw new Error("No existe la casilla serpiente");
        }

        Casilla casillaFinal = null;

        for (Casilla casilla : casillas) {
            if (casilla.getId() == idCasillaFinal) {
                casillaFinal = casilla;
            }
        }

        if (casillaFinal == null) {
            throw new Error("No existe la casilla final");
        }

        casillaSerpiente.setCasillaFinal(casillaFinal);
    }

    public void conectarEscalera(int idCasillaEscalera, int idCasillaFinal) {
        CasillaEscalera casillaEscalera = null;

        for (Casilla casilla : casillas) {
            if (casilla.getId() == idCasillaEscalera) {
                casillaEscalera = (CasillaEscalera) casilla;
            }
        }

        if (casillaEscalera == null) {
            throw new Error("No existe la casilla serpiente");
        }

        Casilla casillaFinal = null;

        for (Casilla casilla : casillas) {
            if (casilla.getId() == idCasillaFinal) {
                casillaFinal = casilla;
            }
        }

        if (casillaFinal == null) {
            throw new Error("No existe la casilla final");
        }

        casillaEscalera.setCasillaFinal(casillaFinal);
    }

    public void siguienteTurno() {
        Jugador jugador = this.jugadores.get(turno++ % jugadores.size());

        System.out.printf("%s se encuentra en la casilla ", jugador);

        if (jugador.getCasilla() == null) {
            System.out.printf("INICIAL\n");
        } else {
            System.out.printf("%d\n", jugador.getCasilla().getId());
        }

        dado1.tirar();
        dado2.tirar();

        System.out.printf("%s saca los dados (%d, %d)", jugador, dado1.getValorEntero(), dado2.getValorEntero());

        int movimientos = dado1.getValorEntero(); // + dado2.getValorEntero();

        System.out.printf(" igual a %d movimientos\n", movimientos);

        int posicionFinal = movimientos - 1;

        if (jugador.getCasilla() != null) {
            Casilla casillaJugador = jugador.getCasilla();
            for (int i = 0; i < casillas.size(); i++) {
                if (casillas.get(i).getId() == casillaJugador.getId()) {
                    posicionFinal = i + movimientos;
                }
            }
        }

        if (posicionFinal >= casillas.size()) {
            posicionFinal = casillas.size() - 1 - (posicionFinal - casillas.size());
        }

        Casilla casillaObjetivo = casillas.get(posicionFinal);

        casillaObjetivo.ponerJugador(jugador);

        if (jugador.getCasilla().getId() == 25) {
            this.ganador = jugador;
            return;
        }
    }

    public boolean activo() {
        return this.ganador == null;
    }

}
