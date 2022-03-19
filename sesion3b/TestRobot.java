public class TestRobot {

    public static void main(String[] args) {

        Robot2D robot = new Robot2D("Arturito");

        robot.describir();

        robot.girarEnSentidoManecillas();

        robot.avanzar();
        robot.avanzar();
        robot.avanzar();

        robot.describir();

    }

}
