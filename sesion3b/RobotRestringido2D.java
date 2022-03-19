public class RobotRestringido2D extends Robot2D {

    private int minX;
    private int maxX;
    private int minY;
    private int maxY;

    public RobotRestringido2D(String nombre, int maxX, int maxY) {
        super(nombre);
        this.minX = 0;
        this.minY = 0;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    @Override
    // Firma avanzar: () -> boolean
    public boolean avanzar() {
        // TODO: Determinar si no podemos avanzar para regresarnos
        switch (super.getOrientacion()) {
            case NORTE:
                if (super.getY() + 1 > maxY) return false; // Termina la función
                break;
            case SUR:
                if (super.getY() - 1 < minY) return false; // Termina la función
                break;
            case ESTE:
                if (super.getX() + 1 > maxX) return false; // Termina la función
                break;
            case OESTE:
                if (super.getX() - 1 < minX) return false; // Termina la función
        }

        // Estamos seguros que podemos avanzar,
        // entonces, avanzamos como originalmente deberíamos
        return super.avanzar(); // Método original avanzar
    }

    // Firma avanzar: (int) -> boolean
    public boolean avanzar(int veces) {
        for (int i = 1; i <= veces; i++) {
            boolean sePudo = this.avanzar();
            if (!sePudo) return false;
        }
        return true;
    }

    public void moverse() {
        this.avanzar();
    }
}

/*
 * Las clases derivadas se llaman subclases de las clases heredadas o superclases
 * Una clase que tiene "hijos" se llama superclase
 * Una clase que tiene "padre" se llama subclase
 * Las subclases solo pueden tener un padre (solo pueden extender una clase)
 * Las superclases pueden tener n-subclases y no le importa
 * Si la superclase tiene un constructor no trivial (por defecto),
 * entonces la subclase deberá definir al menos un constructor
 * y mandar a llamar alguno de los constructores que expone la superclase
 * Es decir, una subclase debe llamar al constructor de la superclase.
 *
 * Podemos acceder a los atributos y métodos originales de la superclase
 * a través de `super`, por ejemplo, `super.x` o `super.foo()`
 *
 * Cuándo sobreescribimos un método `foo()` definido en la superclase
 * (con la anotación @Override), entonces
 * `this.foo()` se referirá al método reemplazado, pero
 * `super.foo()` se referirá al método original (al definido en la superclase)
 *
 */
