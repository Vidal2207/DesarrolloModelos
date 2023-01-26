import Apps.CurrentCondition;

public class ClasePrincipal {
    public static void main(String[]args){
        WeatherData clima = new WeatherData();
        CurrentCondition app1 = new CurrentCondition();
        clima.measurementsChanged(5,1,4);
        clima.registerObserver(app1);
        clima.setTemperature(2);
    }
}
// public class SimuladorPatos {
//     public static void main(String[] args) {
//         Duck mallarDuck,redHead, decoyDuck, rubberDuck, ballorDuck;

//         mallarDuck = new MallardDuck();
//         mallarDuck.showDuck();

//         redHead = new ReadHeadDuck();
//         redHead.showDuck();

//         decoyDuck = new DecoyDuck();
//         decoyDuck.showDuck();

//         rubberDuck = new RubberDuck();
//         rubberDuck.showDuck();

//         ballorDuck = new BallorDuck();
//         ballorDuck.showDuck();

//     }
// }