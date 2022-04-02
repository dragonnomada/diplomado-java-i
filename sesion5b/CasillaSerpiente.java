public class CasillaSerpiente extends Casilla {

    private Casilla casillaFinal;

    public CasillaSerpiente() {
        super();
    }

    public void setCasillaFinal(Casilla casillaFinal) {
        this.casillaFinal = casillaFinal;
        if (this.getId() <= casillaFinal.getId()) {
            throw new Error("No se puede construir una serpiente ascendente");
        }
    }

    @Override
    public void ponerJugador(Jugador jugador) {
        super.ponerJugador(jugador);
        System.out.printf("Hay una serpiente en la casilla %d\n", this.getId());
        System.out.printf("%s ha descendido de la casilla %d a la casilla %d\n", jugador, this.getId(), casillaFinal.getId());
        casillaFinal.ponerJugador(jugador);
    }
}
