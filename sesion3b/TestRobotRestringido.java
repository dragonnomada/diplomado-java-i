public class TestRobotRestringido {

    public static void main(String[] args) {

        RobotRestringido2D robot = new RobotRestringido2D("Arturito", 4, 5);

        robot.describir();

        boolean pudo = robot.avanzar(6);

        robot.describir();

        System.out.printf("Pudo Avanzar: %B\n", pudo);

    }

}
