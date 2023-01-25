public class ReadHeadDuck extends Duck {
    public ReadHeadDuck(){
        this.fb = new FlyWithWings();
        this.qb = new Quack();
    }
    @Override
    public void display(){
        System.out.println("Soy un Readhead");
    }
}
