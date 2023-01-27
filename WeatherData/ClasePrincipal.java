import Apps.CurrentCondition;
import Apps.ForecastDisplay;
import Interfaces.Observer;
public class ClasePrincipal {
    public static void main(String[]args){
        WeatherData clima = new WeatherData();
        Observer app1,app2;
        app1 = new CurrentCondition();
        app2 = new ForecastDisplay();
        clima.registerObserver(app2);
        clima.measurementsChanged(21,32,1025);
        clima.registerObserver(app1);
        clima.setTemperature(26);

    }
}
