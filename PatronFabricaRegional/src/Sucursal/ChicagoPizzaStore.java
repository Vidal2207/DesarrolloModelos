package Sucursal;
import Pizza.Pizza;
import Pizza.StyleChicago.ChicagoStyleCheesePizza;
import Pizza.StyleChicago.ChicagoStylePepperoniPizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item){
        if(item.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if(item.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }
        else return null;
        
    }
}
