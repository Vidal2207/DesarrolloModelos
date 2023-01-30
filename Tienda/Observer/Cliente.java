package Observer;


public class Cliente implements Observer{
    private String nombre,descripcion,nameClient;
    private Double precio;
    public Cliente(String n){
        nameClient=n;
    }
    public void Update(String n,String d,Double p){
        nombre=n;
        descripcion=d;
        precio=p;
        display();
    }
    public void display(){
        System.out.println("********\nCorreo enviado a "+nameClient+"\n Producto: "+nombre+"\n Descripción: "+descripcion+"\n Precio: "+precio+"\n********\n");
        
    }
}
