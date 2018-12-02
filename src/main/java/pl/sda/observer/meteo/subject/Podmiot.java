package pl.sda.observer.meteo.subject;


import pl.sda.observer.meteo.observer.Obserwator;

public interface Podmiot {
    void zarejestrujObserwatora(Obserwator obserwator);
    void usunObserwatora(Obserwator obserwator);
    void powiadomObserwatorow();
}
