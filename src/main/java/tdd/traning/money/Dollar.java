package tdd.traning.money;

public class Dollar extends Money {

    public Dollar(int amount) {
        super(amount);
    }

    @Override
    public Money times(int multiplier) {
        return new Dollar(getAmount() * multiplier);
    }

}
