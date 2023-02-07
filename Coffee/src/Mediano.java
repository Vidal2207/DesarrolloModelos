public class Mediano extends SizeDecorator {
    Beverage beverage;

    public Mediano(Beverage beverage){
        this.beverage=beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Tamaño mediano";
    }

    @Override
    public double cost(){
        return beverage.cost() + (beverage.cost()*.5);
    }
}
