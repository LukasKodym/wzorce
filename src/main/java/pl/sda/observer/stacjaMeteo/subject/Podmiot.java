package pl.sda.observer.stacjaMeteo.subject;


import pl.sda.observer.stacjaMeteo.observer.Obserwator;

public interface Podmiot {
    void zarejestrujObserwatora(Obserwator obserwator);
    void usunObserwatora(Obserwator obserwator);
    void powiadomObserwatorow();
}
