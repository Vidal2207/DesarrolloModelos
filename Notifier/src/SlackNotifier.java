public class SlackNotifier extends NotifierDecorator{
    Notifier app;
    
    public SlackNotifier(Notifier aplication){
        app=aplication;
    }

    @Override
    public String send(){
        return app.send()+", Slack Notification";
    }
}
