package pl.sda.strategy.klient;

import pl.sda.strategy.kwakanie.Kwakanie;
import pl.sda.strategy.latanie.Latanie;

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
