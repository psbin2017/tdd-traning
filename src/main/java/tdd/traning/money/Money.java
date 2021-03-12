package tdd.traning.money;

import lombok.Getter;

import java.util.Objects;

@Getter
public abstract class Money {

    private int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public abstract Money times(int multiplier);

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public static Franc franc(int amount) {
        return new Franc(amount);
    }

    /**
     * auto generate IDE
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
