public class Licitador implements Observer{
    private double precio;
    private String nombreProducto,name;
    public Licitador(String n){
        name=n;
    }
    public void update(String nom,double pre){
        precio=pre;
        nombreProducto=nom;
        display();
    }    
    public void display(){
        System.out.println("Hola "+name+" : El producto "+nombreProducto+" a cambiado de precio a $"+precio);
    }
}

