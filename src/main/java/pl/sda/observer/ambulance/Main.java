package pl.sda.observer.ambulance;

import pl.sda.observer.ambulance.observer.AmbulanceOne;
import pl.sda.observer.ambulance.subject.OperatorAdam;

public class Main {

    public static void main(String[] args) {

        OperatorAdam operatorAdam = new OperatorAdam();
        AmbulanceOne ambulanceOne = new AmbulanceOne(operatorAdam);
        operatorAdam.setStatus("Broken leg");
        ambulanceOne.driveToAccident();
    }
}
