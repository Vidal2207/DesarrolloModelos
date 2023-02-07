public class Chico extends SizeDecorator {
    Beverage beverage;

    public Chico(Beverage beverage){
        this.beverage=beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Tamaño chico";
    }

    @Override
    public double cost(){
        return beverage.cost();
    }
}
