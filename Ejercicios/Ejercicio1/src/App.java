public class App {
    public static void main(String[] args) {
        Producto producto = new ImpresoraA();
        System.out.println(producto.getDescription() + " Precio: $" + producto.cost());
        
        Producto producto2 = new ImpresoraB();
        producto2 = new Descuento5(producto2);
        System.out.println(producto2.getDescription() + " Precio Final: $" + producto2.cost());

        producto = new SocioFrecuente(producto);
        System.out.println(producto.getDescription() + " Precio Final de Socio Frecuente: $" + producto.cost());

    }
}
