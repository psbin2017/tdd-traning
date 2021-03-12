package tdd.traning.money;

public class Sum implements Expression {

    private Money augend;

    private Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, Currency to) {
        int augendRate = bank.rate(augend.getCurrency(), to);
        int addendRate = bank.rate(addend.getCurrency(), to);

        // 코드가 좀 지저분해 보인다.
        int amount = (augend.getAmount() / augendRate) + (addend.getAmount() / addendRate);
        return new Money(amount, to);
    }

}
