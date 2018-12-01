package pl.sda.strategy.tax;

public class TaxPL implements Tax {

    @Override
    public float tax(float amount) {

        return 0.23F * amount;
    }
}
