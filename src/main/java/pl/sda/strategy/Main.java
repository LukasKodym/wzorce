package pl.sda.strategy;

import pl.sda.strategy.klient.DzikaKaczka;
import pl.sda.strategy.klient.Kaczka;
import pl.sda.strategy.kwakanie.Kwacz;

public class Main {
    public static void main(String[] args) {

       Kaczka kaczka = new DzikaKaczka();
       kaczka.plywaj();
//       kaczka.setKwakanie();
       kaczka.wykonajLec();
    }
}
