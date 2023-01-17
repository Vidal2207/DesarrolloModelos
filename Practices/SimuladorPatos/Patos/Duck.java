public abstract class Duck{    
    protected FlyBehavior fb;
    protected QuackBehavior qb;

    public void performQuack(){
        this.qb.quack();
    };
    public void swim(){
        System.out.println("puedo flotar");
    };
    public void display(){};
    public void performFly(){
        this.fb.fly();
    };
    public void showDuck(){
        display();
        performFly();
        performQuack();
        swim();
    };
    public void setQuackBehavior(QuackBehavior q){
        this.qb =q;
    };
    public void setFlyBehavior(FlyBehavior f){
        this.fb=f;
    };
}
