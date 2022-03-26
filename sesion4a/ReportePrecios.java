import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReportePrecios {

    List<IPrecio> precios; // Lista de `objetos interfaz`

    public ReportePrecios() {
        this.precios = new ArrayList<>();
    }

    // IPrecio precio - Es un `objeto interfaz` (proviene de un objeto original)
    public void agregaPrecio(IPrecio precio) {
        this.precios.add(precio);
    }

    public double calcularTotal() {
        double suma = 0.0;

        for (IPrecio precio : this.precios) {
            suma = suma + precio.getPrecio();
        }

        return suma;
    }

    public double obtenerMenor() {
        double menor = Double.MAX_VALUE;

        for (int i = 0; i < this.precios.size(); i++) {
            // precio - objeto interfaz (es un objeto de solo métodos)
            IPrecio precio = this.precios.get(i);
            double precioActual = precio.getPrecio();
            if (precioActual < menor) {
                menor = precioActual;
            }
        }

        return menor;
    }

    public void generarReporte() {
        String reporte = "";
        reporte += "Reporte de Precios\n";
        reporte += "------------------\n";
        reporte += "Precios: " + this.precios.size() + "\n";
        reporte += "Total: $" + this.calcularTotal() + "\n";
        reporte += "Menor: $" + this.obtenerMenor() + "\n";

        System.out.println(reporte);
    }

}
