package pl.sda.strategy.gra_staw;

import pl.sda.strategy.gra_staw.klient.DzikaKaczka;
import pl.sda.strategy.gra_staw.klient.Kaczka;

public class Main {

    public static void main(String[] args) {

       Kaczka kaczka = new DzikaKaczka();
       kaczka.plywaj();
//       kaczka.setKwakanie();
       kaczka.wykonajLec();
    }
}
