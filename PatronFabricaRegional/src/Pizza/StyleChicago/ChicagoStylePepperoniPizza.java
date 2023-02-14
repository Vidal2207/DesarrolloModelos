package Pizza.StyleChicago;
import Pizza.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza(){
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Pepperoni");
    }
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
