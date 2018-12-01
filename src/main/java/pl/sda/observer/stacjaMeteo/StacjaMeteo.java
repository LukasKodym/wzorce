package pl.sda.observer.stacjaMeteo;


import pl.sda.observer.stacjaMeteo.observer.WarunkiBiezaceWyswietl;
import pl.sda.observer.stacjaMeteo.subject.DanePogodowe;

public class StacjaMeteo {
    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();

        WarunkiBiezaceWyswietl warunkiBiezaceWyswietl = new WarunkiBiezaceWyswietl(danePogodowe);
        //ZADANIE!
        //DODAJ DWA KOLEJNE SPOSOBY WYSWIETLANIA
        //PROGNOZA
        //STATYSTYKA
        danePogodowe.ustawOdczyty(26.6f, 35f, 1013.1f);
        danePogodowe.ustawOdczyty(28.1f, 85f, 998.5f);
        danePogodowe.ustawOdczyty(25.9f, 12f, 996.0f);
    }
}
