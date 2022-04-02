public class TestCalendario {

    public static void main(String[] args) {

        Calendario calendario = new Calendario(4, 2022);

        Fecha fechaFinal = calendario.getFechaEnDiasHabiles(13, 44);

        System.out.print(fechaFinal.getDiaSemanaTexto());
        System.out.print(", ");
        System.out.println(fechaFinal);

    }

}
