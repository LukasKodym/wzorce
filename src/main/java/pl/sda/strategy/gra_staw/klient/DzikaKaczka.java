package pl.sda.strategy.gra_staw.klient;

import pl.sda.strategy.gra_staw.kwakanie.Kwacz;
import pl.sda.strategy.gra_staw.latanie.Latam;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        super.setKwakanie(new Kwacz());
        super.setLatanie(new Latam());
    }

    @Override
    public void wyswietl() {
    }
}
