import Sucursal.ChicagoPizzaStore;
import Sucursal.NYPizzaStore;

public class App {
    public static void main(String[] args){
        ChicagoPizzaStore StyleChicago = new ChicagoPizzaStore();
        NYPizzaStore StyleNY = new NYPizzaStore();
        StyleChicago.orderPizza("cheese");
        StyleNY.orderPizza("pepperoni");
    }
}
