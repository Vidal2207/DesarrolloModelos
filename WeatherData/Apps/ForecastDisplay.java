package Apps;
import Interfaces.DisplayElement;
import Interfaces.Observer;

public class ForecastDisplay implements Observer,DisplayElement{
    private float temperatureNew,temperatureOld=20;
    @Override
    public void update(float t,float h,float p){
        temperatureNew=t;
        display();
        temperatureOld=t;
    }
    public void display(){
        if(temperatureNew>temperatureOld){
            System.out.println("APP 2\nLa temperatura aumento de: "+temperatureOld+" °C a "+temperatureNew+" °C");
        }
        if(temperatureNew<temperatureOld){
            System.out.println("APP 2\nLa temperatura disminuyo de: "+temperatureOld+" °C a "+temperatureNew+" °C");
        }
    }

}
