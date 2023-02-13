public class Descuento5 extends DescuentoDecorador {
    Producto producto;
    
    public Descuento5(Producto producto) {
        this.producto = producto;
    }
    
    @Override
    public String getDescription() {
        return producto.getDescription() + ", Descuento del 5% sobre el precio fijo";
    }
    
    @Override
    public double cost() {
        return producto.cost()*0.95;    }
}
    
