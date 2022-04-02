public class TestFecha {

    public static void main(String[] args) {

        Fecha fecha = new Fecha(2022, 4, 18);

        System.out.println(fecha);

        if (fecha.isDomingo()) {
            System.out.println("Es domingo");
        }

        if (fecha.isEntreSemana()) {
            System.out.println("Está entre semana");
        }


    }

}
