public class TestPrecio {

    public static void main(String[] args) {

        Producto producto1 = new Producto("1234", "Agua", 10.5, 100);
        Producto producto2 = new Producto("5678", "Galletas", 15.17, 4);

        Libro libro1 = new Libro("abcd123", "¿Cómo crear libros?", "Dragón Nómada", 2022);
        Libro libro2 = new Libro("xyzw123", "Java Avanzado", "Allan Poe", 1870);
        Libro libro3 = new Libro("rhgf123", "Las aventuras de Pepito", "Anónimo", 1998);

        // Objeto Interfaz
        // - Un objeto interfaz es un objeto limitado a la interfaz
        // - Es decir, hay un `objeto original` (producto1, libro3, ...)
        // - que es transformado en un `objeto limitado`
        // - el cual solo tendrá los métodos definidos por la interfaz
        // - a este objeto limitado le llamaremos el `objeto interfaz` (precio1, precio5, ...)
        // - y solo podremos utilizar los métodos que se definieron en la interfaz
        IPrecio precio1 = producto1;
        IPrecio precio2 = producto2;
        IPrecio precio3 = libro1;
        IPrecio precio4 = libro2;
        IPrecio precio5 = libro3;
        IPrecio precio6 = libro3;

        // A los objetos originales les podemos mandar a llamar a sus métodos
        producto1.agregarExistencia();
        producto2.quitarExistencia();
        libro1.getAutor();
        libro2.leer();
        libro3.getPrecio();

        // A los objetos limitados (objetos interfaz) podemos mandar a llamar a los métodos
        // que están definidos en la interfaz solamente.
        // Es decir, estos objetos se vuelven objetos específicos de la interfaz
        // y sirven para poder manipularlos a alto nivel, si nos interese su origen
        // o sus métodos y atributos originales.
        precio1.getPrecio();
        precio2.getPrecio();
        precio3.getPrecio();
        precio4.getPrecio();
        precio5.getPrecio();
        precio6.getPrecio();
        // Quiere decir, que a partir de ahora, podemos crear sistemas basados en las
        // interfaces, manipulando solamente objetos interfaz, sin que tengamos
        // los detalles de su procedencia o detalles de otras cosas que se escapen
        // de la interfaz.
        // Por ejemplo, podríamos crear una función que reciba dos precios y determine
        // el mayor. O podríamos crear una función que tome una lista de precios
        // y nos devuelva el total. Sin importar si los precios venían de una clase u otra.
        // Esto generaliza sistemas para que podamos basarnos en las interfaces y no en las entidades
        // permitiéndonos manipular múltiples entidades como una única interfaz.
        // Esto es una especie de polimorfismo a nivel interfaz.

        // Producto -> IPrecio
        // Libro -> IPrecio
        // ... -> IPrecio

        ReportePrecios reportePrecios = new ReportePrecios();

        reportePrecios.agregaPrecio(precio1); // precio1 -> objeto interfaz
        reportePrecios.agregaPrecio(precio2);
        reportePrecios.agregaPrecio(libro1);
        reportePrecios.agregaPrecio(libro2);
        reportePrecios.agregaPrecio(libro3);

        reportePrecios.generarReporte();

        ReportePrecios reportePreciosProductos = new ReportePrecios();

        reportePreciosProductos.agregaPrecio(precio1);
        reportePreciosProductos.agregaPrecio(precio2);

        reportePreciosProductos.generarReporte();

        ReportePrecios reportePreciosLibros = new ReportePrecios();

        reportePreciosLibros.agregaPrecio(libro1);
        reportePreciosLibros.agregaPrecio(libro2);
        reportePreciosLibros.agregaPrecio(libro3);

        reportePreciosLibros.generarReporte();


    }

}
