public class DecoyDuck extends Duck {
    public DecoyDuck(){
        this.fb = new FlyNoWay();
        this.qb = new MuteQuack();
    }
    @Override
    public void display(){
        System.out.println("Soy un Decoy");
    }
}
