package tdd.traning.money;

/**
 * 금액 합계 표현식
 */
public class Sum implements Expression {

    private Money augend;

    private Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(String to) {
        int amount = augend.getAmount() + addend.getAmount();
        return new Money(amount, to);
    }
}
