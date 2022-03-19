package lab.robot;

class  Test1Robot2D {

    public static void main(String[] args) {

        // 1. Crear el robot
        // <Clase> <nombre> = new <Clase>();
        Robot2D r2d2 = new Robot2D("Arturito");

        r2d2.describir();

        r2d2.verSur();

        // 2. Ajustar sus valores iniciales
        //r2d2.nombre = "Arturito";
        //r2d2.x = 0;
        //r2d2.y = 0;
        //r2d2.orientacion = 'N';

        // 3. Describir el robot
        r2d2.describir();

        // 4. Girar el robot
        r2d2.girarEnSentidoManecillas();

        // 5. Describir el robot
        r2d2.describir();

        // 6. Avanzar el robot
        r2d2.avanzar();

        // 7. Describir el robot
        r2d2.describir();

        // 8. Girar el robot
        r2d2.girarEnSentidoContrarioManecillas();

        // 9. Describir el robot
        r2d2.describir();

        // 10. Avanzar el robot
        r2d2.avanzar();

        // 11. Describir el robot
        r2d2.describir();

    }

}