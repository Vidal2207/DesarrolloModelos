public class SmsNotifier extends NotifierDecorator {
    Notifier app;
    
    public SmsNotifier(Notifier aplication){
        app=aplication;
    }

    @Override
    public String send(){
        return app.send()+", SMS Notification";
    }
}
