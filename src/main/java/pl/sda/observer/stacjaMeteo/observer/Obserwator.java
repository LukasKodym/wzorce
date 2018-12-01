package pl.sda.observer.stacjaMeteo.observer;

public interface Obserwator {
    void aktualizacja(float temperatura, float wilgotnosc, float cisnienie);
}
