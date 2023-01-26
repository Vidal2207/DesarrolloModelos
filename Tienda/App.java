import Subject.Producto;
import Observer.Cliente;
import Productos.Iphone13;
import Productos.Iphone14;
import Productos.IphoneZX;
import Observer.Observer;

public class App {
    public static void main(String[] args) {
        //PRODUCTOS
        Producto iphone13, iphone14,iphoneZX;
        iphone13 = new Iphone13();
        iphone14 = new Iphone14();
        iphoneZX = new IphoneZX();
        ///CLIENTES
        Observer cliente1,cliente2;
        cliente1 = new Cliente("Esteban Cortez");
        cliente2 = new Cliente("Martha Ortiz");
        /// SUSCRIPCION
        iphone13.RegisterObserver(cliente1);
        iphone14.RegisterObserver(cliente2);
        iphoneZX.RegisterObserver(cliente1);
        iphoneZX.RegisterObserver(cliente2);
        /// ACTUALIZACION DE PRECIO EN IPHONE13
        iphone13.setPrecio(12578.7);
        /// ACTUALIZACION DE PRECIO EN IPHONE14
        iphone14.setPrecio(24789.8);
        /// ACTUALIZAR PRECIO IPHONEZX
        iphoneZX.setPrecio(44789.8);
        /// ELIMINAR SUSCRIPTOR EN IPHONEZX
        iphoneZX.RemoveObserver(cliente2);
        /// ACTUALIZAR PRECIO IPHONEZX
        iphoneZX.setPrecio(34789.8);
    }
}
