import java.util.ArrayList;

public class Calendario {

    public static int getMaximoDia(int mes, int año) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return (año % 4 == 0) ? 29 : 28; // <condición> ? <expresión verdadera> : <expresión falsa>
            default:
                return 0;
        }
    }

    int mes;
    int año;
    int maximoDia;
    ArrayList<Fecha> fechas;

    public Calendario(int mes, int año) {
        this.fechas = new ArrayList<>(); // Inicializamos la lista de fechas

        this.reiniciar(mes, año);
    }

    protected void reiniciar(int mes, int año) {
        this.mes = mes;
        this.año = año;
        this.maximoDia = Calendario.getMaximoDia(mes, año);
        this.fechas.clear();
        for (int dia = 1; dia <= this.maximoDia; dia++) {
            Fecha fechaDelDia = new Fecha(año, mes, dia); // Generamos una nueva fecha
            this.fechas.add(fechaDelDia); // Agregamos el objeto fecha a la lista de fechas
        }
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public int getMaximoDia() {
        return maximoDia;
    }

    public boolean hasFecha(int dia) {
        return dia >= 1 && dia <= this.maximoDia;
    }

    public Fecha getFecha(int dia) {
        return hasFecha(dia) ? this.fechas.get(dia - 1) : null;
    }

    public Fecha getFechaEnDiasHabiles(int diaInicial, int diasHabiles) {
        Fecha fechaInicial = this.getFecha(diaInicial);

        int contadorDiasHabiles = 0;

        int diaDeComienzo = diaInicial;

        Calendario calendario = new Calendario(this.mes, this.año);

        Fecha fechaFinal = fechaInicial;

        while (contadorDiasHabiles < diasHabiles) {
            diaDeComienzo = diaDeComienzo + 1;
            Fecha fechaSiguiente = calendario.getFecha(diaDeComienzo);

            if (fechaSiguiente == null) {
                if (calendario.mes == 12) {
                    calendario = new Calendario(1, calendario.año + 1);
                } else {
                    calendario = new Calendario(calendario.mes + 1, calendario.año);
                }
                diaDeComienzo = 0;
                continue;
            }

            if (fechaSiguiente.isEntreSemana()) {
                contadorDiasHabiles = contadorDiasHabiles + 1;
                fechaFinal = fechaSiguiente;
            }
        }

        return fechaFinal;
    }

    public Fecha getFechaConFinesDeSemana(int diaInicial, int dias) {
        Fecha fechaInicial = this.getFecha(diaInicial);

        int contadorDias = 0;

        int diaDeComienzo = diaInicial;

        Calendario calendario = new Calendario(this.mes, this.año);

        Fecha fechaFinal = fechaInicial;

        while (contadorDias < dias) {
            diaDeComienzo = diaDeComienzo + 1;
            Fecha fechaSiguiente = calendario.getFecha(diaDeComienzo);

            if (fechaSiguiente == null) {
                if (calendario.mes == 12) {
                    calendario = new Calendario(1, calendario.año + 1);
                } else {
                    calendario = new Calendario(calendario.mes + 1, calendario.año);
                }
                diaDeComienzo = 0;
                continue;
            }

            contadorDias = contadorDias + 1;
            fechaFinal = fechaSiguiente;
        }

        return fechaFinal;
    }
}
