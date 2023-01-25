import java.util.ArrayList;

import Interfaces.Observer;
import Interfaces.Subject;

public class WeatherData implements Subject {
    private float temperature,humidity,preassure;
    private ArrayList<Observer> arr = new ArrayList<Observer>();
    // Private Subject subjects;
    @Override
    public void registerObserver(Observer ob){
        arr.add(ob);
    }
    public void removeObserver(Observer ob){
        if(arr.contains(ob)){
            int ind = arr.indexOf(ob);
            arr.remove(ind);
        }
    }
    public void notifiObserver(){
        for(int i=0; i<arr.size();i++){
            Observer obs = arr.get(i);
            obs.update(temperature, humidity, preassure);
        }
    }
    public float gerTemperature(){
        return temperature;
    }
    public float getHumidity(){
        return humidity;
    }
    public float getPressure(){
        return preassure;
    }
    public void measurementsChanged(float t,float h,float p){
        temperature=t;
        humidity=h;
        preassure=p;
        notifiObserver();
    }
}
