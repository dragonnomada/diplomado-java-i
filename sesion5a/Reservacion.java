public class Reservacion implements IAsignacionFechas {

    Fecha fecha;
    int dias;
    boolean conFinesDeSemana;

    public Reservacion(Fecha fecha, int dias, boolean conFinesDeSemana) {
        this.fecha = fecha;
        this.dias = dias;
        this.conFinesDeSemana = conFinesDeSemana;
    }

    @Override
    public Fecha getFechaAsignacion() {
        return fecha;
    }

    @Override
    public int getDiasAsignacion() {
        return dias;
    }

    @Override
    public boolean getConFinesSemana() {
        return conFinesDeSemana;
    }
}
