public class ReducirCantidadFija extends DescuentoDecorador {
    Producto producto;
    
    public ReducirCantidadFija(Producto producto) {
        this.producto = producto;
    }
    
    @Override
    public String getDescription() {
        return producto.getDescription() + ", Reducion de Cantidad Fija del Precio";
    }
    
    @Override
    public double cost() {
        return producto.cost()-200;    
        }
}
    
