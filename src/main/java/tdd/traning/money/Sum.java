package tdd.traning.money;

public class Sum implements Expression {

    private Expression augend;

    private Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, Currency to) {
        int amount = augend.reduce(bank, to).getAmount() + addend.reduce(bank, to).getAmount();
        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression addend) {
        // todo
        return null;
    }

}
