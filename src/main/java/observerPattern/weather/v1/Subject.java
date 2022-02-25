package observerPattern.weather.v1;

public interface Subject {
    boolean registerObserver(Observer o);

    boolean removeObserver(Observer o);

    void notifyObservers();
}
