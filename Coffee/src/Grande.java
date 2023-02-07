public class Grande extends SizeDecorator{
    Beverage beverage;

    public Grande(Beverage beverage){
        this.beverage=beverage;
    }

    public String getSize(){
        return beverage.getDescription() + ", Tamaño graande";
    }

    @Override
    public double cost(){
        return beverage.cost() + beverage.cost();
    }
}
