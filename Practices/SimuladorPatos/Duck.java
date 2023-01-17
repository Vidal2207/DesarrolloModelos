public abstract class Duck implements FlyBehavior,QuackBehavior {    
    FlyBehavior fb;
    QuackBehavior qb;

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
