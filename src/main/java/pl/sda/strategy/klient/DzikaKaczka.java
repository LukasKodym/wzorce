package pl.sda.strategy.klient;

import pl.sda.strategy.kwakanie.Kwacz;
import pl.sda.strategy.latanie.Latam;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        super.setKwakanie(new Kwacz());
        super.setLatanie(new Latam());
    }

    @Override
    public void wyswietl() {

    }



}
