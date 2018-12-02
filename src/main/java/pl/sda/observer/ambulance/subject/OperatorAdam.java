package pl.sda.observer.ambulance.subject;

import pl.sda.observer.ambulance.observer.Ambulance;

import java.util.ArrayList;
import java.util.List;

public class OperatorAdam implements Operator {

    private List<Ambulance> ambulances = new ArrayList<>();
    private String status;

    public String getStatus() {
        return status;
    }

    @Override
    public void registerObserver(Ambulance ambulance) {
        ambulances.add(ambulance);
    }

    @Override
    public void removeObserver(Ambulance ambulance) {
        ambulances.add(ambulance);
    }

    @Override
    public void notifyObserver() {
        for (Ambulance ambulance : ambulances) {
            ambulance.update();
        }
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObserver();
    }
}
