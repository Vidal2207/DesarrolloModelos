public class MallardDuck extends Duck{
    public MallardDuck(){
        this.fb = new FlyWithWings();
        this.qb = new Quack();
    }
    @Override
    public void display(){
        System.out.println("Soy un Mallard");
    }
}
