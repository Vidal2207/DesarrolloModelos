public class SocioFrecuente extends DescuentoDecorador {
    Producto producto;
    
    public SocioFrecuente(Producto producto) {
        this.producto = producto;
    }
    
    @Override
    public String getDescription() {
        return producto.getDescription() + ", Descuento del 10% a los Socios Frecuentes";
    }
    
    @Override
    public double cost() {
        return producto.cost()*0.90;    
        }
}
    
