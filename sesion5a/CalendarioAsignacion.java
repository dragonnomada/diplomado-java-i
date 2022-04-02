public class CalendarioAsignacion extends Calendario implements IRangoFechas {

    Fecha fechaInicial;
    Fecha fechaFinal;

    public CalendarioAsignacion() {
        super(1, 1970);
    }

    public void setAsignacionFechas(IAsignacionFechas asignacionFechas) {
        this.fechaInicial = asignacionFechas.getFechaAsignacion();

        this.reiniciar(this.fechaInicial.getMes(), this.fechaInicial.getAño());

        int dias = asignacionFechas.getDiasAsignacion();

        if (asignacionFechas.getConFinesSemana()) {
            this.fechaFinal = this.getFechaConFinesDeSemana(this.fechaInicial.getDia(), dias);
        } else {
            this.fechaFinal = this.getFechaEnDiasHabiles(this.fechaInicial.getDia(), dias);
        }
    }

    public Fecha getFechaInicial() {
        return fechaInicial;
    }

    public Fecha getFechaFinal() {
        return fechaFinal;
    }
}
