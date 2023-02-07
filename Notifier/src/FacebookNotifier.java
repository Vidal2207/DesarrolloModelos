public class FacebookNotifier extends NotifierDecorator{
    Notifier app;
    
    public FacebookNotifier(Notifier app){
        this.app=app;
    }

    @Override
    public String send(){
        return app.send()+", Facebook Notification";
    }
    
}
