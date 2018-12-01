package pl.sda.strategy.tax;

public class TaxDE implements Tax {

    @Override
    public float tax(float amount) {
        return 0.30F * amount;
    }
}

