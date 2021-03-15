package tdd.traning.money;

import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Getter
@ToString
public class Money implements Expression {

    private int amount;

    private Currency currency;

    public Money(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    /**
     * 달러 화폐를 생성한다.
     */
    public static Money dollar(int amount) {
        return new Money(amount, Currency.DOLLAR);
    }

    /**
     * 프랑 화폐를 생성한다.
     */
    public static Money franc(int amount) {
        return new Money(amount, Currency.FRANC);
    }

    @Override
    public Money reduce(Bank bank, Currency to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    @Override
    public Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
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
}
