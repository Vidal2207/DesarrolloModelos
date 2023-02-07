public class App {
    public static void main(String[] args) throws Exception {
        Notifier app1 = new Aplication("Hola");
        System.out.println(app1.send());
        
        app1 = new FacebookNotifier(app1);
        System.out.println(app1.send());

        Notifier app2 = new Aplication("Nuevo Aviso");
        app2 = new SlackNotifier(app2);
        app2 = new SmsNotifier(app2);
        System.out.println(app2.send());

    }
}
