package tdd.traning.money;

public class Sum implements Expression {

    private Money augend;

    private Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(String to) {
        return new Money(augend.getAmount() + addend.getAmount(), to);
    }

}
