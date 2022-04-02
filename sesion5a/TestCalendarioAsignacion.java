public class TestCalendarioAsignacion {

    public static void main(String[] args) {

        CalendarioAsignacion calendarioAsignacion = new CalendarioAsignacion();

        calendarioAsignacion.setAsignacionFechas(new IAsignacionFechas() {
            @Override
            public Fecha getFechaAsignacion() {
                return new Fecha(2022, 5, 1);
            }

            @Override
            public int getDiasAsignacion() {
                return 8;
            }

            @Override
            public boolean getConFinesSemana() {
                return false;
            }
        });

        System.out.println(calendarioAsignacion.getFechaInicial());
        System.out.println(calendarioAsignacion.getFechaFinal());

    }

}
