package Subject;
import Observer.Observer;
public interface Subject {

    public void RegisterObserver(Observer obs);

    public void NotifyObserver();

    public void RemoveObserver(Observer obs);
    }
