package tdd.traning.money;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Money implements Expression {

    private int amount;

    private Currency currency;

    public Money(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, Currency.DOLLAR);
    }

    public static Money franc(int amount) {
        return new Money(amount, Currency.FRANC);
    }

    @Override
    public Money reduce(Bank bank, Currency to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Money money = (Money) o;
        return amount == money.amount && currency.equals(money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }
}
