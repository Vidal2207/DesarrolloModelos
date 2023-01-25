public class BallorDuck extends Duck {
    public BallorDuck(){
        this.fb = new FlyWithBallon();
        this.qb = new Quack();
    }
    @Override
    public void display(){
        System.out.println("Soy un pato con un globo");
    }
}
