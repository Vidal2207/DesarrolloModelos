package Sucursal;
import Pizza.Pizza;
import Pizza.StyleNewYork.NYStyleCheesePizza;
import Pizza.StyleNewYork.NYStylePepperoniPizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item){
        if(item.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if(item.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }
        else return null;
        
    }
}
