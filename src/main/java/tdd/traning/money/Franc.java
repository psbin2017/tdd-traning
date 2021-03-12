package tdd.traning.money;

public class Franc extends Money {

    public Franc(int amount) {
        super(amount);
    }

    public Franc times(int multiplier) {
        return new Franc(getAmount() * multiplier);
    }

}
