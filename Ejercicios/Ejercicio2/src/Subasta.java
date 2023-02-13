import java.util.ArrayList;

public class Subasta implements Subject {
    private double precio;
    private String nombre;
    private ArrayList<Observer> arregloLicitadores = new ArrayList<Observer>();    
    public Subasta(String n, double p){
        precio=p;
        nombre=n;
    }
    @Override
    public void addObserver(Observer ob){
        arregloLicitadores.add(ob);
    }
    @Override
    public void removeObserver(Observer ob){
        if(arregloLicitadores.contains(ob)){
            int ind = arregloLicitadores.indexOf(ob);
            arregloLicitadores.remove(ind);
        }
    }
    @Override
    public void notifyObserver(){
        for(int i=0; i<arregloLicitadores.size();i++){
            Observer obs = arregloLicitadores.get(i);
            obs.update(nombre,precio);
        }
    }
    public void newPrecio(double p){
        precio=p;
        notifyObserver();
    }
}
