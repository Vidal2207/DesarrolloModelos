public class Aplication extends Notifier{
    public Aplication(String m){
        message = m;
    }
    @Override
    public String send(){
        return message;
    }
}
