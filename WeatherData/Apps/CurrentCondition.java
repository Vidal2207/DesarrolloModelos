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
        // System.out.println("Update");
    }
    public void display(){
        System.out.println(temperature+" "+humidity+" "+preassure);
    }

}
