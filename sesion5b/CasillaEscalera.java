public class CasillaEscalera extends Casilla {

    private Casilla casillaFinal;

    public CasillaEscalera() {
        super();
    }

    public void setCasillaFinal(Casilla casillaFinal) {
        this.casillaFinal = casillaFinal;
        if (this.getId() >= casillaFinal.getId()) {
            throw new Error("No se puede construir una escalera descendente");
        }
    }

    @Override
    public void ponerJugador(Jugador jugador) {
        if (casillaFinal == null) {
            throw new Error("La casilla no ha sido conectada");
        }
        super.ponerJugador(jugador);
        System.out.printf("Hay una escalera en la casilla %d\n", this.getId());
        System.out.printf("%s ha ascendido de la casilla %d a la casilla %d\n", jugador, this.getId(), casillaFinal.getId());
        casillaFinal.ponerJugador(jugador);
    }

}
