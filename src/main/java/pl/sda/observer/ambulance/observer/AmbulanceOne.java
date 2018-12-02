package pl.sda.observer.ambulance.observer;

import pl.sda.observer.ambulance.subject.Operator;
import pl.sda.observer.meteo.observer.Obserwator;

public class AmbulanceOne implements Ambulance {

    private Operator operator;

    public AmbulanceOne(Operator operator) {
        this.operator = operator;
        operator.registerObserver(this);
    }

    @Override
    public void update() {
        driveToAccident();
    }

    @Override
    public void driveToAccident(){
        System.out.println("ijo ijo jado jado");
    }
}
