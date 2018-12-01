package pl.sda.strategy.gra_staw.klient;

import pl.sda.strategy.gra_staw.kwakanie.Kwakanie;
import pl.sda.strategy.gra_staw.latanie.Latanie;

public abstract class Kaczka {

    private Kwakanie kwakanie;
    private Latanie latanie;

    public void plywaj(){
        System.out.println("Kaczka pływa");
    }

    public void wykonajKwacz(){
        kwakanie.kwacz();
    }

    public void wykonajLec(){
        latanie.lec();
    }

    public abstract void wyswietl();

    public void setKwakanie(Kwakanie kwakanie) {
        this.kwakanie = kwakanie;
    }

    public void setLatanie(Latanie latanie) {
        this.latanie = latanie;
    }
}
