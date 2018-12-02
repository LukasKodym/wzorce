package pl.sda.observer.meteo.observer;

public interface Obserwator {
    void aktualizacja(float temperatura, float wilgotnosc, float cisnienie);
}
