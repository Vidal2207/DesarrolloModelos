public class App {
    public static void main(String[] args){
        SimplePizzaFactory Fabrica = new SimplePizzaFactory();
        PizzaStore Tienda = new PizzaStore(Fabrica);
        Tienda.orderPizza("cheese");
    }
}
