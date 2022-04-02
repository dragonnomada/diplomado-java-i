public class TestCalendarioAsignacionConReservacion {

    public static void main(String[] args) {

        Reservacion reservacion = new Reservacion(new Fecha(2022, 5, 1), 6, false);

        CalendarioAsignacion calendarioAsignacion = new CalendarioAsignacion();

        calendarioAsignacion.setAsignacionFechas(reservacion);

        System.out.println(calendarioAsignacion.getFechaInicial());
        System.out.println(calendarioAsignacion.getFechaFinal());

    }

}
