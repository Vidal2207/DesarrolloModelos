public class SimuladorPatos {
    public static void main(String[] args) {
        Duck mallarDuck,redHead, decoyDuck, rubberDuck;

        mallarDuck = new MallardDuck();
        mallarDuck.showDuck();

        redHead = new ReadHeadDuck();
        redHead.showDuck();

        decoyDuck = new DecoyDuck();
        decoyDuck.showDuck();

        rubberDuck = new RubberDuck();
        rubberDuck.showDuck();
    }
}
