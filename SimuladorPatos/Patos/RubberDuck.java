public class RubberDuck extends Duck {
    public RubberDuck(){
        this.fb = new FlyNoWay();
        this.qb = new Squeak();
    }
    public void display(){
        System.out.println("Soy un Rubber");
    }
}
