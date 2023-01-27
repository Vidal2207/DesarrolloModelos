package Apps;

import Interfaces.DisplayElement;
import Interfaces.Observer;

public class CurrentCondition implements Observer,DisplayElement{
    private float temperature,humidity,preassure;
    // Private Subject subjects;
    @Override
    public void update(float t,float h,float p){
        temperature=t;
        humidity=h;
        preassure=p;
        display();
    }
    public void display(){
        System.out.println("APP 1\nLa temperatura es de: "+temperature+" °C \nHumedad "+humidity+" %\nPresión "+preassure+" hPa");
    }

}
