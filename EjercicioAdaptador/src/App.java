public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Test Duck...");
        Duck mallarDuck = new MallorDuck();
        testDuck(mallarDuck);
        System.out.println("Pato disfrazado de Pavo");
        Turkey turkeyAdap = new TurkeyAdapter(mallarDuck);
        testTurkey(turkeyAdap);

    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
    static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }
}

