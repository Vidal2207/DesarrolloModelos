public interface Subject {
    public void addObserver(Observer o);
    public void removeObserver(Observer O);
    public void notifyObserver();
}
