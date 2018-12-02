package pl.sda.observer.ambulance.subject;

public interface Operator {

    void registerObserver();
    void removeObserver();
    void notifyObserver();
}
