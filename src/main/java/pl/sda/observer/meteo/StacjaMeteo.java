package pl.sda.observer.meteo;


import pl.sda.observer.meteo.observer.StatystykaPogodowa;
import pl.sda.observer.meteo.observer.WarunkiBiezaceWyswietl;
import pl.sda.observer.meteo.subject.DanePogodowe;

public class StacjaMeteo {
    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();

        WarunkiBiezaceWyswietl warunkiBiezaceWyswietl = new WarunkiBiezaceWyswietl(danePogodowe);
        StatystykaPogodowa statystykaPogodowa = new StatystykaPogodowa(danePogodowe);
        //ZADANIE!
        //DODAJ DWA KOLEJNE SPOSOBY WYSWIETLANIA
        //PROGNOZA
        //STATYSTYKA
        danePogodowe.ustawOdczyty(26.6f, 35f, 1013.1f);
        danePogodowe.ustawOdczyty(28.1f, 85f, 998.5f);
        danePogodowe.ustawOdczyty(25.9f, 12f, 996.0f);
    }
}
