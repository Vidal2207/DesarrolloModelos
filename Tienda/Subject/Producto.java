package Subject;
import Observer.Observer;

import java.util.ArrayList;

public abstract class Producto implements Subject{
    protected String Nombre, Descripcion;
    protected Double Precio;
    ArrayList<Observer> suscriptores = new ArrayList<Observer>();
    // private Producto p;
    @Override
    public void RegisterObserver(Observer obs){
        suscriptores.add(obs);
    }
    public void NotifyObserver(){
        for(int i=0; i<suscriptores.size();i++){
            if(suscriptores.get(i)!=null){
                Observer ob = suscriptores.get(i);
                ob.Update(Nombre,Descripcion,Precio);
            }
        }
    }
    public void RemoveObserver(Observer obs){
        if(suscriptores.contains(obs)){
            int index = suscriptores.indexOf(obs);
            suscriptores.remove(index);
        }
    }
    public void SetNombre(String n){
        Nombre=n;
        NotifyObserver();
    }
    public void setDescripcion(String D){
        Descripcion=D;
        NotifyObserver();
    }
    public void setPrecio(Double p){
        Precio = p;
        NotifyObserver();
    }

}
