public class Libro implements IPrecio {

    private String isbn;
    private String titulo;
    private String autor;
    private int año;

    public Libro(String isbn, String titulo, String autor, int año) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    @Override
    public double getPrecio() {
        // TODOS LOS LIBROS CUESTAN 9.99
        return 9.99;
    }

    public String getAutor() {
        return this.autor;
    }

    public void leer() {
        System.out.println("Este libro no se puede leer");
    }
}
