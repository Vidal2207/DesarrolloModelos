public class TurkeyAdapter implements Turkey {
    Duck duck;
    public TurkeyAdapter(Duck duck){
        this.duck = duck;
    }
    @Override
    public void fly(){  
        this.duck.fly();
    }
    @Override
     public void gobble(){
        this.duck.quack();
     } 
}
