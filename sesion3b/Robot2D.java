public class Robot2D {

    private String nombre;
    private int x;
    private int y;
    private PuntoCardinal orientacion;

    public Robot2D(String nombre) {
        this.nombre = nombre;
        this.x = 0;
        this.y = 0;
        this.orientacion = PuntoCardinal.NORTE;
    }

    protected PuntoCardinal getOrientacion() {
        return this.orientacion;
    }

    protected int getX() {
        return this.x;
    }

    protected int getY() {
        return this.y;
    }

    // Firma avanzar: () -> boolean
    public boolean avanzar() {
        switch (this.orientacion) {
            case NORTE:
                this.y += 1; // this.y = this.y + 1 | this.y++
                break;
            case SUR:
                this.y -= 1; // this.y = this.y - 1 | this.y--
                break;
            case ESTE:
                this.x += 1; // this.x = this.x + 1 | this.x++
                break;
            case OESTE:
                this.x -= 1; // this.x = this.x - 1 | this.x--
                break;
            default:
                System.out.println("La orientación no es válida >:(");
                break;
        }
        return true;
    }

    public void girarEnSentidoManecillas() {
        switch (this.orientacion) {
            case NORTE:
                this.orientacion = PuntoCardinal.ESTE;
                break;
            case SUR:
                this.orientacion = PuntoCardinal.OESTE;
                break;
            case ESTE:
                this.orientacion = PuntoCardinal.SUR;
                break;
            case OESTE:
                this.orientacion = PuntoCardinal.NORTE;
                break;
            default:
                System.out.println("La orientación no es válida >:(");
                break;
        }
    }

    public void girarEnSentidoContrarioManecillas() {
        switch (this.orientacion) {
            case NORTE:
                this.orientacion = PuntoCardinal.OESTE;
                break;
            case SUR:
                this.orientacion = PuntoCardinal.ESTE;
                break;
            case ESTE:
                this.orientacion = PuntoCardinal.NORTE;
                break;
            case OESTE:
                this.orientacion = PuntoCardinal.SUR;
                break;
            default:
                System.out.println("La orientación no es válida >:(");
                break;
        }
    }

    public void describir() {
        System.out.printf("[#%s] (%d, %d) <%s>\n",
                this.nombre, this.x, this.y, this.orientacion);
    }

}
