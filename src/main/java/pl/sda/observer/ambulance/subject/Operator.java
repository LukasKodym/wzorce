package pl.sda.observer.ambulance.subject;

import pl.sda.observer.ambulance.observer.Ambulance;

public interface Operator {

    void registerObserver(Ambulance ambulance);
    void removeObserver(Ambulance ambulance);
    void notifyObserver();
}
