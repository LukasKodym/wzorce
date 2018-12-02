package pl.sda.observer.meteo.observer;


import pl.sda.observer.meteo.subject.Podmiot;

import java.util.ArrayList;
import java.util.List;

public class StatystykaPogodowa implements WyswietlElement, Obserwator {
    private List<Float> temperatury = new ArrayList<>();
    private List<Float> wilgotnosci = new ArrayList<>();
    private List<Float> cisnienia = new ArrayList<>();
    private Podmiot danePogodowe;

    public StatystykaPogodowa(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        this.danePogodowe.zarejestrujObserwatora(this);//rejestrujemy siebie!
    }

    @Override
    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatury.add(temperatura);
        this.wilgotnosci.add(wilgotnosc);
        this.cisnienia.add(cisnienie);
        wyswietl();

    }


    @Override
    public void wyswietl() {
        System.out.println("Srednia wilgotność z danego okresuw wynosi: " + avgHumidity());
        System.out.println("Srednia temperatura z danego okresuw wynosi: " + avgTemperature());
        System.out.println("Srednie ciśnienie z danego okresuw wynosi: " + avgPreasure());
    }

    private float avgTemperature() {

        float avgSum = 0;
        for (float stat : temperatury) {
            avgSum += stat;
        }
        return avgSum / temperatury.size();
    }

    private float avgPreasure() {

        float avgSum = 0;
        for (float stat : cisnienia) {
            avgSum += stat;
        }
        return avgSum / cisnienia.size();
    }

    private float avgHumidity() {

        float avgSum = 0;
        for (float stat : wilgotnosci) {
            avgSum += stat;
        }
        return avgSum / wilgotnosci.size();
    }
}

