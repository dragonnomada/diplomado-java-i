import java.util.Calendar;

public class Fecha {

    private int año;
    private int mes;
    private int dia;

    public Fecha(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getDiaSemana() {
        Calendar calendar = Calendar.getInstance();

        calendar.set(this.año, this.mes - 1, this.dia);

        //System.out.println(calendar.toInstant());

        int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);

        return diaSemana;
    }

    public boolean isLunes() {
        return this.getDiaSemana() == Calendar.MONDAY;
    }

    public boolean isMartes() {
        return this.getDiaSemana() == Calendar.TUESDAY;
    }

    public boolean isMiercoles() {
        return this.getDiaSemana() == Calendar.WEDNESDAY;
    }

    public boolean isJueves() {
        return this.getDiaSemana() == Calendar.THURSDAY;
    }

    public boolean isViernes() {
        return this.getDiaSemana() == Calendar.FRIDAY;
    }

    public boolean isSabado() {
        return this.getDiaSemana() == Calendar.SATURDAY;
    }

    public boolean isDomingo() {
        return this.getDiaSemana() == Calendar.SUNDAY;
    }

    public boolean isFinDeSemana() {
        return this.isSabado() || this.isDomingo();
    }

    public boolean isEntreSemana() {
        return !this.isFinDeSemana();
    }

    public boolean isAñoBisiesto() {
        return año % 4 == 0;
    }

    public String getDiaSemanaTexto() {
        switch (this.getDiaSemana()) {
            case 1: return "Domingo";
            case 2: return "Lunes";
            case 3: return "Martes";
            case 4: return "Miércoles";
            case 5: return "Jueves";
            case 6: return "Viernes";
            case 7: return "Sábado";
            default: return "desconocido";
        }
    }

    public String getMesTexto() {
        switch (this.mes) {
            case 1: return "enero";
            case 2: return "febrero";
            case 3: return "marzo";
            case 4: return "abril";
            case 5: return "mayo";
            case 6: return "junio";
            case 7: return "julio";
            case 8: return "agosto";
            case 9: return "septiembre";
            case 10: return "octubre";
            case 11: return "noviembre";
            case 12: return "diciembre";
            default: return "desconocido";
        }
    }

    @Override
    public String toString() {
        return String.format("%d %s %d", this.dia, this.getMesTexto(), this.año);
    }
}
